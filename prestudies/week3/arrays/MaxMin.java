package de.brightstraining.prestudies.week3.arrays;

public class MaxMin {
    static int getMinimum(int arr[], int n)
    {
        int resultMinimum = arr[0];
        for (int i = 1; i < n; i++)
            resultMinimum = Math.min(resultMinimum, arr[i]);
        return resultMinimum;
    }

    static int getMaximum(int arr[], int n)
    {
        int resultMaximum = arr[0];
        for (int i = 1; i < n; i++)
            resultMaximum = Math.max(resultMaximum, arr[i]);
        return resultMaximum;
    }

    public static void main(String[] args)
    {
        int arr[] = {1, 4, 5, 7, 20_000, -511, 100, -200, 400};
        int n = arr.length;
        System.out.println("Minimum element of array: " + getMinimum(arr, n));
        System.out.println("Maximum element of array: " + getMaximum(arr, n));
    }
}