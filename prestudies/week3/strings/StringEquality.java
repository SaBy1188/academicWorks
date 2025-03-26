package de.brightstraining.prestudies.week3.strings;

public class StringEquality {
    public static void main(String[] args) {
        // Zuweisung
        String string1 = "Lorem Ipsum";
        String string2 = "Lorem Ipsum";

        // equals Methode
        System.out.println(string1.equals(string2));

        // Äquivalenz Operator
        System.out.println(string1 == string2);

        // Konstruktor
        String string3 = new String("Lorem Ipsum");
        String string4 = new String("Lorem Ipsum");

        System.out.println(string3.equals(string4));
        System.out.println(string3 == string4);

        /** Erläuterung Äquivalenz Operator (==) & equals Methode
         * Beim Äquivalenz Operator wird nicht der Inhalt des Strings verglichen ("Lorem Ipsum"),
         * sondern das Objekt. Da Objekte, auch wenn sie identisch scheinen, unterschiedliche
         * Nummerierungen im Arbeitsspeicher besitzen, werden sie als 'false' ausgegeben.
         *
         * Bei der equals. Methode wird der tatsächliche Inhalt des Strings ("Lorem Ipsum") verglichen.
         */
    }
}