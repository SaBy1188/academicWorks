package de.exercises.arrays;

import javax.swing.plaf.IconUIResource;

public class ModuloSuche {
    public static void main(String[] args) {
        int[] input = new int[]{1, 4, 7, 20000, -511, 201, 373};
        int[] result;

        // Anzahl der Elemente im Array berechnen
        int count = 0;
        for (int item : input) {
            if (item % 2 == 0)
                count++;
        }

        // Gerade Zahlen auslesen
        int index = 0;
        result = new int[count];
        for (int item : input) {
            if (item % 2 == 0) {
                result[index] = item;
                index++;
            }
        }

        for (int item : result) {
            System.out.println(item);
        }
    }
}
