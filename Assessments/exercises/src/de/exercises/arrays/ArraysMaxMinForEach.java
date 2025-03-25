package de.exercises.arrays;

import java.util.Arrays;

public class ArraysMaxMinForEach {
    public static void main(String[] args) {
        int[] input = new int[]{1, 4, 5, 7, 20_000, -511, 100, -200, 400};
        int sum = 0;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        for (int num : input) {
            sum += num;

            if (num < min)
                min = num;

            if (num > max)
                max = num;
        }

        System.out.println(min);
        System.out.println(max);
    }
}
