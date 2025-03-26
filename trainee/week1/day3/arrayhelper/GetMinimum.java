package de.brightstraining.trainee.week1.day3.arrayhelper;

public class GetMinimum {
    public static int getMinimum(int arr[], int n)
    {
        int resultMinimum = arr[0];
        for (int i = 1; i < n; i++)
            resultMinimum = Math.min(resultMinimum, arr[i]);
        return resultMinimum;
    }
}