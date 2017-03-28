package com.tictactoe.generator;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

class TicTacToeGenerator {

    private List<String> methodBodies = new ArrayList<>();
    private StringBuilder currentMethodBody = new StringBuilder();

    void generate() {
        Board board = new Board();
        StringBuilder output = new StringBuilder();
        output.append(Messages.start).append("\n");
        output.append(formattedBoard(board, 2)).append("\n");
        output.append(formattedMessage(2)).append("\n");
        printMove(board, 3);
        for (int i = 0; i < methodBodies.size(); i++) {
            output.append(String.format("        method%d();", i + 1)).append("\n");
        }
        output.append("    }\n");
        for (int i = 0; i < methodBodies.size(); i++) {
            output.append(String.format("    static void method%d() {", i + 1)).append("\n");
            output.append(methodBodies.get(i)).append("\n");
            output.append("    }").append("\n");
        }
        output.append("}").append("\n");

        try (PrintWriter out = new PrintWriter("TicTacToe.java")) {
            out.println(output);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void printMove(Board board, int depth) {
        for (int i = 0; i < 9; i++) {
            if (currentMethodBody.length() > 10000 && depth == 3) {
                methodBodies.add(currentMethodBody.toString());
                currentMethodBody = new StringBuilder();
            }
            board = new Board(board);
            if (board.getTile(i) != Tile.EMPTY) {
                continue;
            }
            board.placeTile(Tile.X, i);
            appendIndented(0, indentLevel(depth) + String.format("if (move == %d) {", i));

            if (board.isWinner(Tile.X)) {
                // if the OptimalPlayer algorithm is correct, this should never happen
                appendIndented(depth + 1, "System.out.println(\"You win!\");");
                appendIndented(0, formattedBoard(board, depth + 1));
                appendIndented(depth + 1, "System.exit(0);");
                appendIndented(depth, "}");
                board.removeTile(i);
                continue;
            }

            if (board.isFull()) {
                appendIndented(depth + 1, "System.out.println(\"It's a tie!\");");
                appendIndented(0, formattedBoard(board, depth + 1));
                appendIndented(depth + 1, "System.exit(0);");
                appendIndented(depth, "}");
                continue;
            }

            OptimalPlayer computer = new OptimalPlayer(board, Tile.O);
            int computerMove = computer.getOptimalMove();
            board.placeTile(Tile.O, computerMove);

            appendIndented(depth + 1, "System.out.println(" + Messages.computerMoveMessages[computerMove] + ");");
            appendIndented(0, formattedBoard(board, depth + 1));

            if (board.isWinner(Tile.O)) {
                appendIndented(depth + 1, "System.out.println(\"The computer wins!\");");
                appendIndented(0, formattedBoard(board, depth + 1));
                appendIndented(depth + 1, "System.exit(0);");
                appendIndented(depth, "}");
                board.removeTile(i);
                board.removeTile(computerMove);
                continue;
            }

            appendIndented(0, formattedMessage(depth + 1));
            printMove(board, depth + 1);
            board.removeTile(i);
            board.removeTile(computerMove);
            appendIndented(0, indentLevel(depth) + "}");
        }
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
