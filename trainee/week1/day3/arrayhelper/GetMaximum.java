package de.brightstraining.trainee.week1.day3.arrayhelper;

public class GetMaximum {
    static int getMaximum(int arr[], int n)
    {
        int resultMaximum = arr[0];
        for (int i = 1; i < n; i++)
            resultMaximum = Math.max(resultMaximum, arr[i]);
        return resultMaximum;
    }
}