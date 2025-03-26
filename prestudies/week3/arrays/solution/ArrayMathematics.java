package de.brightstraining.prestudies.week3.arrays.solution;

public class ArrayMathematics {

    public static void main(String[] args) {

        int zeilen = 10;
        int spalten = 10;
        int[][] ergebnisse = new int[zeilen][spalten];

        // Iteration über die X-Achse
        for(int x = 1; x <= spalten; x++) {

            // Zeilenweise Iteration
            for(int y = 1; y <= zeilen; y++) {

                // Die Variablen können gleichermaßen als
                // Indizes und Faktoren verwendet werden.
                ergebnisse[x-1][y-1] = x * y;
            }
        }

        // Ausgabe der Ergebnisse auf die Konsole.
        for(int x = 1; x <= spalten; x++) {
            for(int y = 1; y <= zeilen; y++) {
                System.out.printf("%4d", ergebnisse[x-1][y-1]);
            }
            System.out.println();
        }
    }
}