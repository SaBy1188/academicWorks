package de.brightstraining.prestudies.week3.strings.solution;

public class StringMethods {

    public static void main(String[] args) {

        String text = "Alle sagten, das geht nicht. Dann kam einer, der wusste das nicht und hat es einfach gemacht.";

        // Hole die beiden Großbuchstaben aus dem Text heraus (charAt).
        char a = text.charAt(0);
        System.out.println(a);

        char d = text.charAt(29);
        System.out.println(d);

        // Vergleiche den Text mit deinem Namen und interpretiere das Ergebnis (compareTo).
        int vergleich = text.compareTo("Academy Work");
        // Ganzzahliger Abstand des lexikalischen Vergleichs: Al ... Ac
        System.out.println(vergleich);

        // Verkette deinen Vor- mit deinem Nachnamen.
        String vorname = "Oliver";
        String nachname = " Hock";
        String name = vorname.concat(nachname);
        System.out.println(name);
        System.out.println(vorname + nachname);

        // Schaue nach, ob die Wörter “gemacht” und “Java” vorkommen (contains).
        boolean gemacht = text.contains("gemacht");
        System.out.println(gemacht);

        boolean java = text.contains("Java");
        System.out.println(java);

        // Vergleiche zwei Strings auf Gleichheit (equals).
        String fahrrad = "Fahrrad";
        String zweitesFahrrad = "Fahrrad";
        String tretroller = "Tretroller";
        boolean gleichheit = fahrrad.equals(zweitesFahrrad);
        System.out.println(gleichheit);
        boolean ungleichheit = fahrrad.equals(tretroller);
        System.out.println(ungleichheit);

        // Gib den Index des ersten “d”s aus (indexOf).
        int index = text.indexOf("d");
        System.out.println(index);

        // Prüfe auf den Leerstring “” (isEmpty).
        boolean leerstring = text.isEmpty();
        System.out.println(leerstring);

        leerstring = "".isEmpty();
        System.out.println(leerstring);

        // Prüfe einen deklarierten String auf “null”.
        String meinName = null;
        boolean nullString = (meinName == null);
        System.out.println(nullString);

        meinName = "Oliver";
        nullString = (meinName == null);
        System.out.println(nullString);

        // Gib die Länge des Textes aus (length).
        int laenge = text.length();
        System.out.println(laenge);

        // Lese die Wörter “sagten” und “gemacht” aus (substring).
        String sagten = text.substring(5, 11);
        System.out.println(sagten);

        String gemachtWort = text.substring(text.length() - 8, text.length() - 1);
        System.out.println(gemachtWort);
    }
}