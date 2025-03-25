package de.exercises.zeichenketten;

import java.util.Scanner;

public class Quittung {
    public static double steuersatz7 = 0.07;
    public static double steuersatz19 = 0.19;
    public static double gesamtbetrag = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welches Produkt kaufst du: ");
        String inputProdukt = scanner.next();
        System.out.println("Was kostet das Produkt: ");
        int inputPreis = scanner.nextInt();
        System.out.println("Wie oft kaufst du das Produkt: ");
        int inputMenge = scanner.nextInt();
        System.out.println("Handelt es sich um ein Lebensmittel (y/n): ");
        String inputProduktart = scanner.next();

        scanner.close();


        gesamtbetrag = inputPreis * inputMenge;

        System.out.println("----- QUITTUNG -----");
        System.out.println("Produkt: " + inputProdukt);
        System.out.println();
        System.out.println("Gesamtbetrag: ${gesamtbetrag}" + gesamtbetrag + " EUR");
        System.out.println("inkl. Steuern: " + Quittung.gesamtbetragPlusSteuern(inputProduktart) + " EUR");
        System.out.println("davon Steuern: " + davonSteuern(inputProduktart) + " EUR");
        System.out.println("--------------------");
    }

    public static double davonSteuern(String produkt) {
        if (produkt.toLowerCase().equals("y")) {
            double davonSteuern = gesamtbetrag * steuersatz7;
            return davonSteuern;
        } else if (produkt.toLowerCase().equals("n")) {
            double davonSteuern = gesamtbetrag * steuersatz19;
            return davonSteuern;
        }
        return 0;
    }

    public static double gesamtbetragPlusSteuern(String produkt) {
        if (produkt.toLowerCase().equals("y")) {
            double betragPlusSteuern = gesamtbetrag + Quittung.davonSteuern(produkt);
            return betragPlusSteuern;
        } else if (produkt.toLowerCase().equals("n")) {
            double betragPlusSteuern = gesamtbetrag + Quittung.davonSteuern(produkt);
            return betragPlusSteuern;
        }
        return 0;
    }
}
