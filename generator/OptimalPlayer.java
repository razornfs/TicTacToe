package com.tictactoe.generator;

class OptimalPlayer {

    private Board board;
    private Tile tile;

    OptimalPlayer(Board board, Tile tile) {
        this.board = board;
        this.tile = tile;
    }

    int getOptimalMove() {
        int bestScore = Integer.MIN_VALUE;
        int bestMove = -1;
        for (int i = 0; i < 9; i++) {
            if (board.isTileEmpty(i)) {
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
        if (isMaximizing) {
            int bestScore = Integer.MIN_VALUE;
            for (int i = 0; i < 9; i++) {
                if (board.isTileEmpty(i)) {
                    board.placeTile(tile, i);
                    bestScore = Math.max(bestScore, minimax(depth + 1, false));
                    board.removeTile(i);
                }
            }
            return bestScore;
        } else {
            int bestScore = Integer.MAX_VALUE;
            for (int i = 0; i < 9; i++) {
                if (board.isTileEmpty(i)) {
                    board.placeTile(opponent(tile), i);
                    bestScore = Math.min(bestScore, minimax(depth + 1, true));
                    board.removeTile(i);
                }
            }
            return bestScore;
        }
    }

    private int evaluate() {
        if (tile != Tile.X && tile != Tile.O) {
            throw new IllegalArgumentException("Invalid player");
        }
        if (board.isWinner(tile)) {
            return 10;
        }
        if (board.isWinner(opponent(tile))) {
            return -10;
        }
        return 0;
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
