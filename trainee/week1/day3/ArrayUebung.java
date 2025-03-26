package de.brightstraining.trainee.week1.day3;

public class ArrayUebung {
    public static void main(String[] args) {

        boolean[][] board = new boolean[8][8];

        // FOR Schleife zur Erstellung des Musters

        // 1. for = Bedingung für Reihe; So lange x kleiner der Anzahl der Arrays ist
        // 2. for = Bedingung für Spalte; So lange y kleiner der Anzahl der Arrays ist

        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {

                // Zieht sich die geraden Werte durch Modulo-Operator
                // x % 2 == 0 -> x geteilt durch zwei Vergleich mit Null

                // 1. if = Elemente / Arrays in der Reihe
                // 2. if = Spalten (2, 4, 6. Spalte usw.)
                if (x % 2 == 0) {
                    if (y % 2 == 0) {
                        board[x][y] = true;
                        // Wenn das zutrifft = O
                    }
                } else {
                    if (!(y % 2 == 0)) {
                        board[x][y] = true;
                        // Wenn nicht, dann = X
                        // Bedingung wurde negiert
                    }
                }
            }
        }

        // FOR Schleife zum Ausgeben

        // 1. for = Reihen
        // 2. for = Spalten
        for (int j = 0; j < board.length; j++) {
            for (int i = 0; i < board[j].length; i++) {

                // Wenn das zutrifft, drucke O
                // ansonsten X
                if (board[j][i]) {
                    System.out.print("O ");
                } else {
                    System.out.print("X ");
                }
            }
            // Zeilenumbruch
            System.out.println();
        }
    }
}