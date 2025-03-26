package de.brightstraining.prestudies.week3.strings;

public class StringMethods {
    public static void main(String[] args) {
        String stringBeispielText =
                "Alle sagten, das geht nicht. \n"
                + "Dann kam einer, der wusste das nicht \n"
                + "und hat es einfach gemacht.\n";
        System.out.println(stringBeispielText);


        // Großbuchstaben (charAt)
        String isUpperCase = "";
        int lengthString = stringBeispielText.length();
        for (int x = 0; x < lengthString; x++) {
            if (Character.isUpperCase(stringBeispielText.charAt(x))) {
                char upperCase = stringBeispielText.charAt(x);
                isUpperCase = isUpperCase + upperCase + " ";
            }
        }
        System.out.println("Die Großbuchstaben sind: " + isUpperCase);


        // Vergleich mit Namen (compareTo)
        String name = "Sabrin";
        System.out.println("Vergleich mit Vornamen: " + name.compareTo(stringBeispielText));

        /**Die compareTo Methode gibt im Vergleich zweier Strings Werte <0, 0 oder >0 aus.
         * Entsprechend der Einsortierung der Strings im Alphabet.
         * Kleiner 0 = String1 kommt in alphabetischer Reihenfolge vor String2
         * Gleich 0 = String1 und String2 sind gleich (also s1.equals(s2) = true)
         * Größer 0 = String1 kommt in alphabetischer Reihenfolge nach String2
         *
         * Im Folgenden heißt dies, dass mein Name, welcher mit einem großen 'S' startet, alphabetisch
         * hinter dem großen Anfangsbuchstaben 'A' vom Beispieltext liegt.*/


        // Verkettung Vor- mit Nachnamen (concat)
        String vorname = "Sabrin";
        String nachname = "Byaah";
        System.out.println("Verknüpfung von Vor- und Nachname: " + vorname.concat(" " + nachname));


        // Wortsuche "gemacht" und "Java" (contains)
        String wort1 = "gemacht";
        String wort2 = "Java";
        if (stringBeispielText.contains(wort1)) {
            System.out.println("Das Wort 'gemacht' ist im Text enthalten.");
        } else {
            System.out.println("Das Wort 'gemacht' ist nicht im Text enthalten.");
        }
        if (stringBeispielText.contains(wort2)) {
            System.out.println("Das Wort 'Java' ist im Text enthalten.");
        } else {
            System.out.println("Das Wort 'Java' ist nicht im Text enthalten.");
        }


        // Strings vergleichen (equals)
        if (wort1.equals(wort2)) {
            System.out.println("Die Wörter sind identisch.");
        } else {
            System.out.println("Die Wörter sind nicht identisch.");
        }


        // Index von 'd' ausgeben (indexOf)
        System.out.println("Das erste 'd' befindet sich an Stelle: " + stringBeispielText.indexOf('d'));


        // Leerstring prüfen (isEmpty)
        System.out.println("Der String ist leer: " + stringBeispielText.isEmpty());


        // Deklarierten String auf null prüfen (null)
        if (stringBeispielText==null) {
            System.out.println("Das Objekt wurde auf 'null' geprüft und enthält keinen Wert.");
        } else {
            System.out.println("Das Objekt wurde auf 'null' geprüft und enthält einen Wert.");
        }


        // Textlänge (length)
        System.out.println("Anzahl der Zeichen im Text: " + stringBeispielText.length());


        // Wörter "sagten" und "gemacht" auslesen (substring)
        int indexStartWort1 = stringBeispielText.indexOf("sagten");
        String wortSuche1 = "sagten";
        int lengthWort1 = wortSuche1.length();
        int countChars1 = indexStartWort1 + lengthWort1;
        String substringWort1 = stringBeispielText.substring(indexStartWort1,countChars1);
        System.out.println("Hier das Wort das Sie suchten: " + substringWort1);

        int indexStartWort2 = stringBeispielText.indexOf("gemacht");
        String wortSuche2 = "gemacht";
        int lengthWort2 = wortSuche2.length();
        int countChars2 = indexStartWort2 + lengthWort2;
        String substringWort2 = stringBeispielText.substring(indexStartWort2,countChars2);
        System.out.println("Hier das Wort das Sie suchten: " + substringWort2);
    }
}