package com.tictactoe.generator;

public class OptimalPlayer {

    private Board board;
    private Tile tile;

    public OptimalPlayer(Board board, Tile tile) {
        this.board = board;
        this.tile = tile;
    }

    public int getOptimalMove() {
        int bestScore = Integer.MIN_VALUE;
        int bestMove = -1;
        for (int i = 0; i < 9; i++) {
            if (board.getTile(i) == Tile.EMPTY) {
                board.placeTile(tile, i);
                int currentScore = minimax(0, false);
                board.removeTile(i);
                if (currentScore > bestScore) {
                    bestScore = currentScore;
                    bestMove = i;
                }
            }
        }
        return bestMove;
    }

    private int minimax(int depth, boolean isMaximizing) {
        int score = evaluate();
        if (score == 10) {
            return score - depth;
        }
        if (score == -10) {
            return score + depth;
        }
        if (board.isFull()) {
            return 0;
        }
        int bestScore = Integer.MIN_VALUE;
        if (isMaximizing) {
            for (int i = 0; i < 9; i++) {
                if (board.getTile(i) == Tile.EMPTY) {
                    board.placeTile(tile, i);
                    bestScore = Math.max(bestScore, minimax(depth + 1, false));
                    board.removeTile(i);
                }
            }
        } else {
            for (int i = 0; i < 9; i++) {
                if (board.getTile(i) == Tile.EMPTY) {
                    board.placeTile(opponent(tile), i);
                    bestScore = Math.max(bestScore, minimax(depth + 1, true));
                    board.removeTile(i);
                }
            }
        }
        return bestScore;
    }

    private int evaluate() {
        if (tile != Tile.X && tile != Tile.O) {
            throw new IllegalArgumentException("Invalid player");
        }
        if (!board.isWinner(Tile.X) && !board.isWinner(Tile.O)) {
            return 0;
        }
        if (board.isWinner(tile)) {
            return 10;
        }
        return -10;
    }

    private Tile opponent(Tile tile) {
        if (tile == Tile.X) {
            return Tile.O;
        }
        if (tile == Tile.O) {
            return Tile.X;
        }
        throw new IllegalArgumentException();
    }
}
