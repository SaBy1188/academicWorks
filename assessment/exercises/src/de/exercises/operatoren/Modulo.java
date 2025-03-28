package de.exercises.operatoren;

public class Modulo {
    public static void main(String[] args) {
        // Aufgabe 1: Gerade Zahlen
        int begin = 43;
        int  i;

        for (i = 0; i <= begin; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ist gerade");
            } else {
                System.out.println(i + " ist ungerade");
            }
        }

        // Aufgabe 2: Restwert
        int j = 6;                      // 0,1,2,3,4 - beim Teilen durch 5 entstehen immer die selben Restwerte von 0 - 4
        System.out.println(j % 5);
    }
}
