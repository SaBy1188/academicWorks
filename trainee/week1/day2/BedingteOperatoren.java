package de.brightstraining.trainee.week1.day2;

public class BedingteOperatoren {
    public static void main(String[] args) {
        // Aufgabe Vorgabe
        for (int i = 0; i < 100; i++) {
            if (i >= 5 && i <= 10) {
                System.out.println(i);
            }
        }
        // Umformulierung in ODER-Operator, Nutzung des !-Operators
        for (int i = 0; i < 100; i++) {
            if (!(i < 5 || i > 10)) {
                System.out.println(i);
            }
        }
    }
}