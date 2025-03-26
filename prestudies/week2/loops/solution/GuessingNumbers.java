package de.brightstraining.prestudies.week2.loops.solution;

import java.util.Scanner;
public class GuessingNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Zufallszahl zwischen 0.0 (inklusiv) und 1.0 (exklusiv)
        double zufallszahl = Math.random();

        // Zufallszahl mit 100 multiplizieren. Damit sind Zahlen
        // 0 bis 99 möglich. Wird Eins addiert, liegen die zu
        // ratenden Zahlen immer von 1 bis 100.
        // Die Klammersetzung und die Typumwandlung sind hier
        // ebenfalls von entscheidender Bedeutung.
        int zuRatendeZahl = (int) (zufallszahl * 100 + 1);

        int versuche = 0;
        boolean erraten = false;
        do {
            System.out.println("Rate deine Zahl: ");
            int gerateneZahl = scanner.nextInt();

            System.out.println(++versuche + ". Versuch: " + gerateneZahl);
            if(gerateneZahl < zuRatendeZahl) {
                // alle kleineren Zahlen
                System.out.println("Die zu ratende Zahl ist größer.");
            } else if(gerateneZahl > zuRatendeZahl) {
                // alle größeren Zahlen
                System.out.println("Die zu ratende Zahl ist kleiner");
            } else {
                // hier bleibt nur noch die Zahl selbst
                System.out.println("Du hast die Zahl erraten.");
                erraten = true;
            }
        } while(!erraten);
    }
}