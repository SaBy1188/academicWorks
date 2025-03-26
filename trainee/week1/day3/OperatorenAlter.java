package de.brightstraining.trainee.week1.day3;

import java.util.Scanner;

public class OperatorenAlter {
    // Aufgabe: Gebe Text entsprechend des Alters aus Nutzereingabe aus.

    // Alter >= 60 Jahre    Du bist sau alt.
    // Alter > 40 Jahre     Also jung ist anders.
    // Alter > 20 Jahre     Nochmal Glück gehabt.
    // Alter <= 20 Jahre    Du Baby.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int alter;

        System.out.println("Sag mir wie alt du bist:");
        alter = scanner.nextInt();

        if (alter >= 60) {
            System.out.println("Du bist sau alt.");
        } else if (alter > 40) {
            System.out.println("Also jung ist anders.");
        } else if (alter > 20) {
            System.out.println("Nochmal Glück gehabt.");
        } else {
            System.out.println("Du Baby.");
        }
    }
}