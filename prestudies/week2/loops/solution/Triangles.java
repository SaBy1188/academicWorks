package de.brightstraining.prestudies.week2.loops.solution;

import java.util.Scanner;
public class Triangles {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wie groß sollen deine Dreiecke sein? ");
        int hoehe = scanner.nextInt();

        System.out.println("Wie viele von diesen Dreiecken möchtest du zeichnen? ");
        int anzahl = scanner.nextInt();

        // Diese Schleife ist für die Anzahl der Dreiecke.
        for(int k = 0; k < anzahl; k++) {

            // Diese Schleife zeichnet die Zeilen
            // eines einzelnen Dreiecks.
            for(int j = 0; j < hoehe; j++) {
                String zeile = "";

                // Diese Schleife füllt das Dreieck
                // nach und nach aus.
                for(int i = 0; i < j + 1; i++) {
                    zeile += "*"; // besser: Verwendung von StringBuilder.append("*")
                }
                System.out.println(zeile);
            }

            // Zwischenraum zwischen den Dreiecken lassen.
            System.out.println();
        }
    }
}