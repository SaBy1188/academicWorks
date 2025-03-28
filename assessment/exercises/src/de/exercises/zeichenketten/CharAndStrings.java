package de.exercises.zeichenketten;

import java.util.Arrays;
import java.util.List;

public class CharAndStrings {
    public static void main(String[] args) {
        // Zeichenkette rückwärts ausgeben
        char[] zeichenkette = {'J', 'a', 'v', 'a', '-', 'K', 'u', 'r', 's'};
        for (int i = zeichenkette.length -1; i >= 0; i--) {
            System.out.println(zeichenkette[i]);
        } System.out.println("\n");

        // Jedes 2. Zeichen ausgeben
        for (int i = 0; i <= zeichenkette.length -1; i+=2) {
            System.out.println(zeichenkette[i]);
        } System.out.println("\n");

        // Zeichenkette zu String konvertieren
        String charToString = new String(zeichenkette);
        System.out.println(zeichenkette);
        System.out.println("\n");

        // String in Char umwandeln
        String guteLaune = "absolut";
        char[] stringToChar = guteLaune.toCharArray();
        for (char c : stringToChar) {
            System.out.println(c);
        } System.out.println("\n");

        // String in Ganzzahlen umwandeln
        // Trennzeichen: https://codegym.cc/de/groups/posts/java-string-split-methode
        String zahlenString = "1,2,4,9,8,7,6,4,1";
        for (String s : zahlenString.split(",")) {
            System.out.println(Integer.parseInt(s));
        }
    }
}
