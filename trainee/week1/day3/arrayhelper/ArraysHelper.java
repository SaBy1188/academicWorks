package de.brightstraining.trainee.week1.day3.arrayhelper;

public class ArraysHelper {
    public static void main(String[] args) {
        System.out.println("Max: " + maxNumber());
        System.out.println("Max: " + minNumber());
        System.out.println("Sum: " + sumArray());
    }

    // Eigenschaften
    static int[] input = new int[] {1, 2, 4, 56, 345, -234};
    static int summe = 0;
    static int maximum = input[0];
    static int minimum = input[0];

    // Methoden
    // Methode maxNumber
    public static int maxNumber() {
        for (int i = 0; i < input.length; i++) {
            if (maximum < input[i]) {
            maximum = input[i];
            }
        }
        return maximum;
    }

    // Methode minNumber
    public static int minNumber() {
        for (int i = 0; i < input.length; i++) {
            if (minimum > input[i]) {
                minimum = input[i];
            }
        }
        return minimum;
    }

    // Methode sumArray
    public static int sumArray() {
        for (int s : input) {
            summe += s;
        }
        return summe;
    }
}