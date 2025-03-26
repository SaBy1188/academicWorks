package de.brightstraining.prestudies.week3.strings.solution;

public class StringEquality {

    public static void main(String[] args) {

        // Erstelle die beiden Strings durch direkte Zuweisung (str1 = “Vergleich”).

        String str1 = "Vergleich";
        String str2 = "Vergleich";

        boolean gleich = (str1 == str2);
        System.out.println(gleich);

        gleich = str1.equals(str2);
        System.out.println(gleich);

        // Erstelle die beiden Strings mit dem Konstruktor (str = new String(“Vergleich”);

        str1 = new String("Vergleich");
        str2 = new String("Vergleich");

        gleich = (str1 == str2);
        // Hier werden die Speicheradressen der Objekte verglichen. Diese sind unterschiedlich.
        System.out.println(gleich);

        gleich = str1.equals(str2);
        System.out.println(gleich);

    }
}