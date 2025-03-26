package de.brightstraining.prestudies.week2.operators.solution;

import java.util.Scanner;
public class TimeUnit {

    public static void main(String[] args) {

        System.out.println("Wie viele Sekunden hast du zur Verfügung: ");
        Scanner scanner = new Scanner(System.in);
        long sekunden = scanner.nextLong();

        long minuten = sekunden / 60;
        int sekundenRest = (int) (sekunden % 60);
        System.out.println(minuten + " Minuten und " + sekundenRest + " Sekunden");

        long stunden = minuten / 60;
        int minutenRest = (int) (minuten % 60);
        System.out.println(stunden + " Stunden und " + minutenRest + " Minuten und " +
                sekundenRest + " Sekunden");

        long tage = stunden / 24;
        int stundenRest = (int) (stunden % 24);
        System.out.println(tage + " Tage und " + stundenRest + " Stunden und " + minutenRest +
                " Minuten und " + sekundenRest + " Sekunden");

        long jahre = tage / 365;
        int tageRest = (int) (tage % 365);
        System.out.println(jahre + " Jahre und " + tageRest + " Tage und " + stundenRest +
                " Stunden und " + minutenRest + " Minuten und " + sekundenRest + " Sekunden");
    }
}