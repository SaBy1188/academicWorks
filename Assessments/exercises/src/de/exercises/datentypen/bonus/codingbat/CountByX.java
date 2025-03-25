package de.exercises.datentypen.bonus.codingbat;

public class CountByX {
    public static int[] countBy(int x, int n){
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = x + x * i;
        }
        return arr;
    }
}
