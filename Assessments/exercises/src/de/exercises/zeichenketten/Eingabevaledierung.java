package de.exercises.zeichenketten;

import java.util.Scanner;

public class Eingabevaledierung {
    public static void main(String[] args) {
        // Eingabefehler, falls String zu lange
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.length() <= 10) {
            System.out.println("OK");
        } else {
            System.out.print("Eingabefehler");
        }

        // Eingabefehler, Regeln
        Scanner scanner2 = new Scanner(System.in);
        String input2 = scanner2.nextLine();

        boolean groesser5 = input2.length() > 5;
        boolean zwischen48 = input2.length() >= 4 && input2.length() <= 8;
        boolean beginnZahlen = Character.isDigit(input2.charAt(0)) && Character.isDigit(input2.charAt(1));
        boolean enthaeltChen = input2.contains("chen");
        boolean doppelpunkt = input2.endsWith(":");

        if (groesser5) {
            System.out.println("OK");
        } else {
            System.out.println("Eingabefehler");
        }

        if (zwischen48) {
            System.out.println("OK");
        } else {
            System.out.println("Eingabefehler");
        }

        if (beginnZahlen) {
            System.out.println("OK");
        } else {
            System.out.println("Eingabefehler");
        }

        if (enthaeltChen) {
            System.out.println("OK");
        } else {
            System.out.println("Eingabefehler");
        }

        if (doppelpunkt) {
            System.out.println("OK");
        } else {
            System.out.println("Eingabefehler");
        }

        boolean error = false;
        for (int i = 0; i < input2.length(); i++) {
            char c = input2.charAt(i);
            if (c != Character.toUpperCase(c))
                error = true;
        }
        if (error == false) {
            System.out.println("OK");
        } else System.out.println("Eingabefehler");

        int leftChar = input2.indexOf('(');
        int rightChar = input2.indexOf(')');
        if (leftChar >= 0 && rightChar >= 0 && leftChar < rightChar) {
            System.out.println("OK");
        } else System.out.println("Eingabefehler");

        scanner.close();
    }
}
