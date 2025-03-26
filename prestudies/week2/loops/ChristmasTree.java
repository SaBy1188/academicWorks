package de.brightstraining.prestudies.week2.loops;

public class ChristmasTree {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i ++) {
            // Loop für die Höhe des Baumes

            // Loop für zentriert
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(" ");
            }

            // Loop für Sterne
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}