package de.exercises.operatoren;

import java.util.zip.ZipFile;

public class Bedingt {
    public static void main(String[] args) {
        // Aufgabe: Programm umformulieren; || und ! nutzen
        for (int i = 0; i < 100; i++) {
            if (i >= 5 && i <= 10) {
                System.out.println(i);
            }
        }
        // Umformulierung
        for (int i = 0; i < 100; i++) {
            if (!(i < 5 || i > 10)) {
                System.out.println(i);
            }
        }

        // Aufgabe: Programm umschreiben; ! nutzen
        for (int i = 0; i < 100; i++) {
            if (i >= 5 && i <= 10 || i == 42) {
                System.out.println(i);
            }
        }
        // Umformulierung
        for (int i = 0; i < 100; i++) {
            if (i >= 5 && i <= 10 || !(i != 42)) {
                System.out.println(i);
            }
        }
    }
}
