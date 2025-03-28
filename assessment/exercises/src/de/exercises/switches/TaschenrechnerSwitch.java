package de.exercises.switches;

import java.util.Scanner;

public class TaschenrechnerSwitch {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int result = 0;
        String operator;

        Scanner input = new Scanner(System.in);
        System.out.println("enter number 1: ");
        num1 = input.nextInt();
        System.out.println("enter number 1: ");
        num2 = input.nextInt();
        System.out.println("enter operator: ");
        operator = input.next();

        switch (operator) {
            case "+":
                add(num1, num2);
                break;
            case "-":
                subtract(num1, num2);
                break;
            case "*":
                multiply(num1, num2);
                break;
            case "/":
                divide(num1, num2);
                break;
            default:
                System.out.println("wrong input");
                break;
        }
    }

    private static void divide(int num1, int num2) {
        int result;
        result = num1 / num2;
        System.out.println(result);
    }

    private static void multiply(int num1, int num2) {
        int result;
        result = num1 * num2;
        System.out.println(result);
    }

    private static void subtract(int num1, int num2) {
        int result;
        result = num1 - num2;
        System.out.println(result);
    }

    private static void add(int num1, int num2) {
        int result;
        result = num1 + num2;
        System.out.println(result);
    }
}
