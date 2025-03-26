package de.brightstraining.trainee.week1.day2;

public class ModuloOperator {
    static void unterscheideZahlen(int zahlWert) {
        if (zahlWert % 2 == 0) {
            System.out.println("Zahl ist gerade");
        }
    }

    public static void main(String[] args) {
        unterscheideZahlen(2);

        // Aufgabe Modulo Operator
        for (int i = 0; i <= 43; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " Zahl ist gerade");
            } else {
                System.out.println(i + " Zahl ist ungerade");
            }
        }
    }
}