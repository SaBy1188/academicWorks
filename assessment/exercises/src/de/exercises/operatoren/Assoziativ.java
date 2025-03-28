package de.exercises.operatoren;

public class Assoziativ {
    public static void main(String[] args) {
        int i = 43;
        i = i + 100;
        i = i - 24;
        i = i * 2;
        i = i / 5;

        // Umformulierung in assoziative Operatoren
        int j = 43;
        j += 100;
        j -= 24;
        j *= 2;
        j /= 5;
        boolean isEqual = i == j;
        System.out.println(isEqual);
    }
}
