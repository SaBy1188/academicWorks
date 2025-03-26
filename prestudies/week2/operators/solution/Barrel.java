package de.brightstraining.prestudies.week2.operators.solution;

import java.util.Scanner;
public class Barrel {
    public static void main(String[] args) {

        double pi = 3.1415; // oder besser: Math.PI

        Scanner scanner = new Scanner(System.in);

        System.out.println("Umfang: ");
        int umfang = scanner.nextInt();

        System.out.println("Höhe: ");
        int hoehe = scanner.nextInt();

        double durchmesser = umfang / pi;
        double flaecheBoden = pi * ( durchmesser / 2 ) * ( durchmesser / 2 );
        double flaecheMantel = umfang * hoehe;
        double gesamtFlaeche = 2 * flaecheBoden + flaecheMantel;
        System.out.println("Gesamtfläche: " + gesamtFlaeche);

        double volumen = flaecheBoden * hoehe;
        System.out.println("Volumen: " + volumen);
    }
}