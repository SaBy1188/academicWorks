package de.exercises.operatoren.bonus;

import java.util.Scanner;

public class BonusSchaltjahr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputYear = scanner.nextInt();

        boolean istSchaltjahr = inputYear % 4 == 0 && !(inputYear % 100 == 0);

        if (istSchaltjahr) {
            System.out.println(inputYear + " ist ein Schaltjahr");
        } else {
            System.out.println(inputYear + " ist kein Schaltjahr");
        }
    }
}
