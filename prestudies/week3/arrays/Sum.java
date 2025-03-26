package de.brightstraining.prestudies.week3.arrays;

import java.util.Arrays;

public class Sum {
    public static void main(String[] args) {
        /*
        double[] input = new double[] {1, 4, 7.20000, -511, 100, -200, 400};
        */
        int[] input = {1, 4, 5, 7, 20_000, -511, 100, -200, 400};
        int summeInput = Arrays.stream(input).sum();

        System.out.println("The sum of the array is: " + summeInput);
    }
}