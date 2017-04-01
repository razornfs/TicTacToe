package com.tictactoe.generator;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

class TicTacToeGenerator {

    private List<String> methodBodies = new ArrayList<>();
    private StringBuilder currentMethodBody = new StringBuilder();
    private StringBuilder output = new StringBuilder();

    void generate() {
        Board board = new Board();
        printInitialMessages(board);
        printMove(board, 3);
        printMethodCalls();
        printMethodDefinitions();
        createOutputFile();
    }

    private void printInitialMessages(Board board) {
        output.append(Messages.start).append("\n");
        output.append(formattedBoard(board, 2)).append("\n");
        output.append(formattedMessage(2)).append("\n");
    }

    private void printMethodCalls() {
        for (int i = 0; i < methodBodies.size(); i++) {
            output.append(String.format("        method%d();", i + 1)).append("\n");
        }
        output.append("    }\n");
    }

    private void printMethodDefinitions() {
        for (int i = 0; i < methodBodies.size(); i++) {
            output.append(String.format("    static void method%d() {", i + 1)).append("\n");
            output.append(methodBodies.get(i)).append("\n");
            output.append("    }").append("\n");
        }
        output.append("}").append("\n");
    }

    private void createOutputFile() {
        try (PrintWriter out = new PrintWriter("TicTacToe.java")) {
            out.println(output);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private void printMove(Board board, int depth) {
        printMoveValidation(board, depth);
        for (int i = 0; i < 9; i++) {
            breakDownBigMethod(depth);
            board = new Board(board);
            if (!board.isTileEmpty(i)) {
                continue;
            }
            board.placeTile(Tile.X, i);

            appendIndented(depth, String.format("if (move == %d) {", i));

            if (board.isWinner(Tile.X)) {
                printExitingMessage(board, depth, "You win!");
                continue;
            }

            if (board.isFull()) {
                printExitingMessage(board, depth, "It's a tie!");
                continue;
            }

            OptimalPlayer computer = new OptimalPlayer(board, Tile.O);
            int computerMove = computer.getOptimalMove();
            board.placeTile(Tile.O, computerMove);

            printComputerMove(depth + 1, computerMove);
            appendIndented(0, formattedBoard(board, depth + 1));

            if (board.isWinner(Tile.O)) {
                printExitingMessage(board, depth, "The computer wins!");
                board.removeTile(i);
                board.removeTile(computerMove);
                continue;
            }

            appendIndented(0, formattedMessage(depth + 1));
            printMove(board, depth + 1);
            board.removeTile(i);
            board.removeTile(computerMove);
            appendIndented(depth, "}");
        }
    }

    // In java there's a maximum size of a method that's equal to 64 KB.
    // To avoid compilation errors we're splitting the code into several helper methods.
    private void breakDownBigMethod(int depth) {
        if (currentMethodBody.length() > 10000 && depth == 3) {
            methodBodies.add(currentMethodBody.toString());
            currentMethodBody = new StringBuilder();
        }
    }

    private void printComputerMove(int depth, int computerMove) {
        appendIndented(depth + 1,
                       String.format("System.out.println(%s);", Messages.computerMoveMessages[computerMove]));
    }

    private void printExitingMessage(Board board, int depth, String message) {
        appendIndented(depth + 1, String.format("System.out.println(\"%s\");", message));
        appendIndented(0, formattedBoard(board, depth + 1));
        appendIndented(depth + 1, "System.exit(0);");
        appendIndented(depth, "}");
    }

    private void printMoveValidation(Board board, int depth) {
        List<Integer> filledTiles = board.getFilledTiles();
        String condition = formattedCondition(filledTiles);
        appendIndented(0, formattedMoveValidation(condition, depth));
    }

    private String formattedCondition(List<Integer> emptyTiles) {
        String ret = "";
        int size = emptyTiles.size();
        if (size == 0) {
            return "(move < 0 || move >= 9)";
        }
        for (Integer emptyTile : emptyTiles.subList(0, size - 1)) {
            ret += String.format("move == %d || ", emptyTile);
        }
        ret += String.format("move == %d", emptyTiles.get(size - 1));
        return String.format("(move < 0 || move >= 9 || %s)", ret);
    }

    private String formattedMoveValidation(String condition, int depth) {
        return String.format(Messages.moveValidationTemplate.replaceAll("\n", "\n" + indentLevel(depth)), condition);
    }

    private String formattedBoard(Board board, int depth) {
        return String.format(Messages.boardTemplate.replaceAll("\n", "\n" + indentLevel(depth)),
                             board.getTile(0).getValue(), board.getTile(1).getValue(), board.getTile(2).getValue(),
                             board.getTile(3).getValue(), board.getTile(4).getValue(), board.getTile(5).getValue(),
                             board.getTile(6).getValue(), board.getTile(7).getValue(), board.getTile(8).getValue());
    }

    private String formattedMessage(int depth) {
        return Messages.message.replaceAll("\n", "\n" + indentLevel(depth));
    }

    private String indentLevel(int level) {
        String ret = "";
        for (int i = 0; i < level; i++) {
            ret += "    ";
        }
        return ret;
    }

    private void appendIndented(int level, String message) {
        currentMethodBody.append(indentLevel(level)).append(message).append("\n");
    }
}
