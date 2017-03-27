package com.tictactoe.generator;

public class TicTacToeGenerator {
    public void generate() {
        Board board = new Board();
        System.out.println(Messages.start);
        System.out.println(formattedBoard(board, 1));
        System.out.println(formattedMessage(1));
        printMove(board, 2);
        System.out.println("    }\n}");
    }

    private void printMove(Board board, int depth) {
        for (int i = 0; i < 9; i++) {
            board = new Board(board);
            if (board.getTile(i) != Tile.EMPTY) {
                continue;
            }
            board.placeTile(Tile.X, i);
            System.out.println(indentLevel(depth) + String.format("if (move == %d) {", i));
            System.out.println(formattedBoard(board, depth + 1));

            if (board.isWinner(Tile.X)) {
                printIndented(depth + 1, "System.out.println(\"You win!\");");
                printIndented(depth + 1, "System.exit(0);");
                printIndented(depth, "}");
                continue;
            }

            if (board.isFull()) {
                printIndented(depth + 1, "System.out.println(\"It's a tie!\");");
                printIndented(depth + 1, "System.exit(0);");
                printIndented(depth, "}");
                continue;
            }

            OptimalPlayer computer = new OptimalPlayer(new Board(board), Tile.O);
            int computerMove = computer.getOptimalMove();
            board.placeTile(Tile.O, computerMove);

            printIndented(depth + 1, "System.out.println(" + Messages.computerMoveMessages[computerMove] + ");");
            System.out.println(formattedBoard(board, depth + 1));

            if (board.isWinner(Tile.O)) {
                printIndented(depth + 1, "System.out.println(\"The computer wins!\");");
                printIndented(depth + 1, "System.exit(0);");
                printIndented(depth, "}");
                continue;
            }

            System.out.println(formattedMessage(depth + 1));
            printMove(board, depth + 1);
            board.removeTile(i);
            board.removeTile(computerMove);
            System.out.println(indentLevel(depth) + "}");
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

    private void printIndented(int level, String message) {
        System.out.println(indentLevel(level) + message);
    }
}
