package de.brightstraining.prestudies.week2.operators.solution;

import java.util.Scanner;
public class Metropols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name der Stadt: ");
        String stadtName = scanner.next();

        System.out.println("Ist " + stadtName + " eine Hauptstadt ('true' oder 'false')?");
        boolean hauptstadt = scanner.nextBoolean();

        System.out.println("Wie viele Einwohner hat " + stadtName + "?");
        int anzahlEinwohner = scanner.nextInt();

        System.out.println("Steuereinnahmen pro Einwohner");
        double steuerEinnahmenProEinwohner = scanner.nextDouble();

        // Gesamte Steuereinnahmen berechnen
        double gesamtSteuerEinnahmen = anzahlEinwohner * steuerEinnahmenProEinwohner;
        double wantedSteuern = 1_000_000_000.0;

        System.out.println("gesamtSteuerEinnahmen = " + gesamtSteuerEinnahmen);
        System.out.println("wantedSteuern = " + wantedSteuern);

        System.out.println("missing = " + (wantedSteuern - gesamtSteuerEinnahmen));

        if(hauptstadt && anzahlEinwohner > 100_000) {
            // falls Hauptstadt UND echt größer als 100_000 Einwohner

            System.out.println(stadtName + " ist eine Metropole, denn sie ist eine " +
                    "Hauptstadt und hat " + anzahlEinwohner + " Einwohner");

        } else if(anzahlEinwohner > 200_000 && gesamtSteuerEinnahmen >= 1_000_000_000.0) {
            // falls mehr als 200000 Einwohner und mindestens 1000000 Euro Steuern

        System.out.println(stadtName + " ist eine Metropole, denn sie hat "
                + anzahlEinwohner + " Einwohner und ein Steueraufkommen von "
                + gesamtSteuerEinnahmen + " Euro jährlich.");
        } else {
            System.out.println(stadtName +" ist keine Metropole.");
        }
    }
}