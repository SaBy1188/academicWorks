package de.exercises.arrays;

import java.util.Arrays;
public class ArraysMaxMin {
    public static void main(String[] args) {
        int[] input = new int[]{1, 4, 5, 7, 20_000, -511, 100, -200, 400};

        // Array Summe
        int sum = 0;
        for (int i = 0; i < input.length - 1; i++) {
            sum = sum + input[i];
        }
        System.out.println(sum);

        // Min, Max mit Arrays.sort
        Arrays.sort(input);
        System.out.println(input[input.length - 1]);
        System.out.println(input[0]);

        // Min, Max mit Methoden
        int n = input.length;
        System.out.println(getMaximum(input, n));
        System.out.println(getMinimum(input, n));

        // Min, Max mit MAX / MIN. VALUE
        int summe = 0;
        int max = Integer.MAX_VALUE;        // FALSCH, nimmt Integerwerte nicht i aus Array
        int min = Integer.MIN_VALUE;

        for (int i = 0; i < input.length; i++) {
            summe += input[i];

            if (input[i] < min) {
                min = input[i];
            }

            if (input[i] > max) {
                max = input[i];
            }
        }
        System.out.println(summe);
        System.out.println(max);
        System.out.println(min);
    }

    // Min, Max mit for Schleife
    public static int getMaximum(int input[], int n) {
        int resultMaximum = input[0];
        for (int i = 0; i < n; i++) {
            resultMaximum = Math.max(resultMaximum, input[i]);
        }
        return resultMaximum;
    }

    public static int getMinimum(int input[], int n) {
        int resultMinimum = input[0];
        for (int i = 0; i < n; i++) {
            resultMinimum = Math.min(resultMinimum, input[i]);
        }
        return resultMinimum;
    }
}
