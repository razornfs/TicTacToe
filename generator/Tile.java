package com.tictactoe.generator;

public enum Tile {
    X("X"),
    O("O"),
    EMPTY(" ");

    private String value;

    Tile(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
