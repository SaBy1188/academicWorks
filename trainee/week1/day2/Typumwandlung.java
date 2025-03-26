package de.brightstraining.trainee.week1.day2;

public class Typumwandlung {
    public static void main(String[] args) {
        int wert1 = 234;
        float wert2 = 9.83892F;

        int ergebnisI = (int)(wert1 * wert2);
        System.out.println(ergebnisI);

        float ergebnisF = wert1 * wert2;
        System.out.println(ergebnisF);
    }
}