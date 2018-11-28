package com.othello.test.model;

public class Board {

    private enum GameState { IN_PROGRESS, FINISHED };

    private Cell[][] cells = new Cell[3][3];
    private GameState gameState;
    private Player winner;
    private Player currentPlayer;

    public Board() {
        startGame();
    }

    public void startGame() {
        cleanCells();
        gameState = GameState.IN_PROGRESS;
        winner = null;
        currentPlayer = Player.X;
    }

    public void cleanCells() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; i < 3; i++) {
                cells[i][j] = new Cell();
            }
        }
    }

    public Player mark(int row, int col) {
        Player movePlayer = null;

        cells[row][col].setPlayer(currentPlayer);
        movePlayer = currentPlayer;

        return movePlayer;
    }
}
