package de.brightstraining.prestudies.week1.input.solution;

import java.util.Scanner;
public class Geometrics {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wert für a: ");
        int a = scanner.nextInt();

        System.out.println("Wert für b: ");
        int b = scanner.nextInt();

        // Berechnung der Fläche des Rechtecks.
        int flaecheRechteck = a * b;
        System.out.println("Fläche des Rechtecks: " + flaecheRechteck);

        // Berechnung des Umfangs des Rechtecks.
        int umfangRechteck = (2 * a) + (2 * b); // Klammersetzung optional wegen Punkt-vor-Strich
        System.out.println("Fläche des Rechtecks: " + umfangRechteck);

        // Berechnung der Fläche des rechtwinkeligen Dreiecks.
        double flaecheRechtwinkligesDreieck = (a * b) / 2.; // 2. ist äquivalent zu 2.0
        System.out.println("Fläche des rechtwinkligen Dreiecks: " + flaecheRechtwinkligesDreieck);

        // Berechnung des Umfangs des rechtwinkligen Dreiecks.
        double c = Math.sqrt((a * a) + (b * b));
        double umfangRechtwinkligesDreieck = a + b + c;
        System.out.println("Umfang des rechtwinkligen Dreiecks: " + umfangRechtwinkligesDreieck);
    }
}