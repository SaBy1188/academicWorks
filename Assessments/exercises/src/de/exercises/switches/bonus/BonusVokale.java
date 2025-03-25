package de.exercises.switches.bonus;

import java.util.Scanner;

public class BonusVokale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("give char");
        char inputChar = scanner.next().charAt(0);

        switch (inputChar) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("consonant");
        }
    }
}
