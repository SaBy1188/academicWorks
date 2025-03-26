package de.brightstraining.trainee.week1.day3.schachbrett;

public class UebungSchachbrett2 {
    public static void main(String[] args) {

        // Erstelle Board
        boolean[][] board = new boolean[8][8];

        // fill board
        for (int outer = 0; outer < board.length; outer++) {

            for (int inner = 0; inner < board[outer].length; inner++) {

                // Um einen alternierenden Anfang von "X" oder "O" wird der Index der äußeren und inneren Zaähler addiert
                int istSummeIndexGerade = (inner + outer) % 2;

                if (istSummeIndexGerade == 0) {
                    board[outer][inner] = true;
                } else {
                    board[outer][inner] = false;
                }
            }
        }

        // print board
        for (int outer = 0; outer < board.length; outer++) {

            for (int inner = 0; inner < board[outer].length; inner++) {

                if (board[outer][inner]) {
                    System.out.print("O");
                } else {
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
}