package de.brightstraining.prestudies.week3.arrays.solution;

public class Sum {

    public static void main(String[] args) {

        // Wir können ein Array direkt bei der Deklaration initialisieren.
        int[] durcheinander = new int[] { 1, 4, 5, 7, 20000, -511, 100, -200, 400 };

        // Nun ermitteln wir die Summe aller Elemente durch Aufsummierung.
        // Dazu verwenden wir eine Variable, die uns als Zwischenspeicher
        // und letzten Endes als Summe dient.
        int summe = 0;
        for(int i = 0; i < durcheinander.length; i++) {

            summe += durcheinander[i];
            // Das "+=" ist gleichbedeutend zu
            // summe = summe + durcheinander[i];
        }

        // Hier ist die Summe nun ermittelt und kann ausgegeben werden.
        System.out.println("Summe der Elemente: " + summe);

    }
}