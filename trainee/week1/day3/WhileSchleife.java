package de.brightstraining.trainee.week1.day3;

import java.util.Scanner;

public class WhileSchleife {
    public static void main(String[] args) {
        Scanner scanEingabe = new Scanner(System.in);
        System.out.println("Gib eine Zahl ein:");
        int eingabeZahl = scanEingabe.nextInt();

        int i = 1;

        while (i <= eingabeZahl) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("fertig");
    }
}