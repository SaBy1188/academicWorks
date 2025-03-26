package de.brightstraining.trainee.week1.day3;

import java.util.Scanner;

public class DoWhileSchleife {
    public static void main(String[] args) {
        Scanner scanEingabe = new Scanner(System.in);
        System.out.println("Gib eine Zahl ein:");
        int eingabeZahl = scanEingabe.nextInt();

        int i = 1;

        do {
            System.out.print(i + " ");
            i++;
        }
        while (i <= eingabeZahl);
        System.out.println("fertig");
    }
}