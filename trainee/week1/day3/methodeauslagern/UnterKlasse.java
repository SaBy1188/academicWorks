package de.brightstraining.trainee.week1.day3.methodeauslagern;

public class UnterKlasse {
    public static void main(String[] args) {
        System.out.println(methodeA());
        System.out.println(methodeB());
    }

    public static String methodeA() {
        String textA = "Ich bin Methode A";

        return textA;
    }

    public static String methodeB() {
        String textB = "Ich Methode B";

        return textB;
    }
}