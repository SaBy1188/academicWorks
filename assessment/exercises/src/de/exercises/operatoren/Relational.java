package de.exercises.operatoren;

import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {
        int age = 0;

        Scanner scanner = new Scanner(System.in);
        int inputAge = scanner.nextInt();

        // Ausgabe von Text zum entsprechenden Alter
        if (inputAge >= 60) {
            System.out.println("Am Tod vorbei geschlittert");
        } else if (inputAge > 40) {
            System.out.println("Alter Sack");
        } else if (inputAge > 20) {
            System.out.println("Deine besten Jahre");
        } else {
            System.out.println("Baby TeenieWeenie");
        }
    }
}
