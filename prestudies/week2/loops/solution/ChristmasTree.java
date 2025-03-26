package de.brightstraining.prestudies.week2.loops.solution;

import java.util.Scanner;
public class ChristmasTree {
    public static void main(String[] args) {

        // Im ersten Schritten legen wir die Größe des Baumes fest.
        System.out.println("Wie groß soll Ihr Baum sein: ");
        int hoehe = new Scanner(System.in).nextInt();

        // Dann zeichnen wir den Baum
        for (int i = 1; i <= hoehe; i++) {

            // Von links nach rechts die Leerzeichen zeichnen
            for (int j = 1; j <= hoehe - i; j++) {
                System.out.print(" ");
            }

            // Dann die Nadeln
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            // Die rechten Leerzeichen werden vernachlässigt.

            System.out.println();
        }

        // Zum Schluss kommt noch der Stamm
        for (int i = 1; i < hoehe; i++) {
            System.out.print(" ");
        }
        System.out.println("I");
    }
}