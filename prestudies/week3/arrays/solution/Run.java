package de.brightstraining.prestudies.week3.arrays.solution;

public class Run {

    public static void main(String[] args) {

        // Bei der Deklaration eines Arrays wird
        // die Länge, also die Anzahl enthaltener
        // Elemente angegeben, hier 9.
        int[] zahlen = new int[9];

        // Der Einfachheit halber iterieren wir
        // durch das Array und legen die Zahlen
        // von 1 bis 9 fest.
        for(int i = 0; i < 9; i++) {

            // Der Index des Arrays läuft von
            // 0 bis 8, referenziert also alle
            // neun Elemente.
            zahlen[i] = i + 1;
        }

        // Nun geben wir die Zahlen absteigend
        // auf der Konsole aus.
        for(int i = zahlen.length - 1; i >= 0; i--) {
            System.out.println(zahlen[i]);
        }
    }
}