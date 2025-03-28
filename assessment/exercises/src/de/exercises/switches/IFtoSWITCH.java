package de.exercises.switches;

import java.util.Scanner;

public class IFtoSWITCH {
    public static void main(String[] args) {
        int choice = 0;

        Scanner stdin = new Scanner(System.in);
        System.out.println("enter choice: ");

        choice = stdin.nextInt();

        if (choice == 1) {
            System.out.println("selected 1");
        } else if (choice == 2 || choice == 3) {
            System.out.println("selected 2 or 3");
        } else if (choice == 4) {
            System.out.println("selected 4");
        } else System.out.println("wrong input");

        // switch
        switch (choice) {
            case 1:
                System.out.println("selected 1");
                break;
            case 2:
            case 3:
                System.out.println("selected 2 or 3");
                break;
            case 4:
                System.out.println("selected 4");
                break;
            default:
                System.out.println("wrong input");
                break;
        }
    }
}
