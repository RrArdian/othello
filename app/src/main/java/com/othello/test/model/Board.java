package com.othello.test.model;

public class Board {
    private Cell[][] cells;

    public Board() {
        resetGame();
    }

    public void resetGame() {
        cells = new Cell[3][3];
    }
}
