package de.brightstraining.prestudies.week2.loops;
import java.util.Scanner;
public class Triangles {
    public static void main(String[] args) throws Throwable {
        Scanner scannerTriangle = new Scanner(System.in);

        int inputRows;
        System.out.println("""
        How many rows should your triangles have?
        Choose between 3 and 5 rows.
        """);

        // Prüft, ob es sich um Ganzzahlen handelt
        while (true)
            try {
                inputRows = Integer.parseInt(scannerTriangle.nextLine());
                break;
            } catch (NumberFormatException nfe) {
                System.out.println("Try again: ");
            }
        // Scanner Methode ausgelagert
        triangleCase(scannerTriangle, inputRows);
    }

    // Scanner Methode: Anzahl der Dreiecke
    private static void triangleCase(Scanner scannerTriangle, int inputRows) {
        int countTriangles;
        do {
            System.out.println("""
                    How many triangle would you have?
                    A maximum of 2 is allowed.
                    """);

            while (true)
                try {
                    countTriangles = Integer.parseInt(scannerTriangle.nextLine());

                    // Konsolenausgabe ausgelagert
                    drawTriangles(inputRows, countTriangles);

                } catch (NumberFormatException nfe) {
                    System.out.println("Try again.");
                }
        } while (countTriangles < inputRows);
    }

    // Konsolenausgabe der Dreiecke
    private static void drawTriangles(int inputRows, int countTriangles) {
        if (inputRows == 3 && countTriangles == 1) {
            System.out.println("""
                    *
                    **
                    ***
                    """);
        } else if (inputRows == 3 && countTriangles == 2) {
            System.out.println("""
                    *
                    **
                    ***
                    
                    *
                    **
                    ***
                    """);
        } else if (inputRows == 4 && countTriangles == 1) {
            System.out.println("""
                    *
                    **
                    ***
                    ****
                    """);
        } else if (inputRows == 4 && countTriangles == 2) {
            System.out.println("""
                    *
                    **
                    ***
                    ****
                    
                    *
                    **
                    ***
                    ****                   
                    """);
        } else if (inputRows == 5 && countTriangles == 1) {
            System.out.println("""
                    *
                    **
                    ***
                    ****
                    *****
                    """);
        } else if (inputRows == 5 && countTriangles == 2) {
            System.out.println("""
                    *
                    **
                    ***
                    ****
                    *****
                    
                    *
                    **
                    ***
                    ****
                    *****
                    """);
        } else {
            System.out.println("Your input is not aloud.");
        }
    }
}