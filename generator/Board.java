package com.tictactoe.generator;

import java.util.Arrays;

class Board {
    private Tile[] board;

    Board() {
        board = new Tile[9];
        Arrays.fill(board, Tile.EMPTY);
    }

    Board(Board board) {
        Tile[] copy = new Tile[board.board.length];
        System.arraycopy(board.board, 0, copy, 0, board.board.length);
        this.board = copy;
    }

    Tile getTile(int position) {
        if (!rangeCheck(position)) {
            throw new IllegalArgumentException();
        }
        return board[position];
    }

    // returns false if the move is invalid
    boolean placeTile(Tile tile, int position) {
        if (!isEmpty(position)) {
            return false;
        }
        board[position] = tile;
        return true;
    }

    boolean removeTile(int position) {
        if (!rangeCheck(position)) {
            return false;
        }
        board[position] = Tile.EMPTY;
        return true;
    }

    private boolean isEmpty(int position) {
        return rangeCheck(position) && board[position] == Tile.EMPTY;
    }

    private boolean rangeCheck(int position) {
        return position >= 0 && position < 9;
    }

    boolean isFull() {
        for (Tile tile : board) {
            if (tile == Tile.EMPTY) {
                return false;
            }
        }
        return true;
    }

    boolean isWinner(Tile tile) {
        return checkRows(tile) || checkColumns(tile) || checkDiagonals(tile);
    }

    private boolean checkRows(Tile tile) {
        for (int i = 0; i != 9; i += 3) {
            if (board[i] == tile && board[i + 1] == tile && board[i + 2] == tile) {
                return true;
            }
        }
        return false;
    }

    private boolean checkColumns(Tile tile) {
        for (int i = 0; i < 3; i++) {
            if (board[i] == tile && board[i + 3] == tile && board[i + 6] == tile) {
                return true;
            }
        }
        return false;
    }

    private boolean checkDiagonals(Tile tile) {
        return board[0] == tile && board[4] == tile && board[8] == tile ||
               board[2] == tile && board[4] == tile && board[6] == tile;
    }
}
