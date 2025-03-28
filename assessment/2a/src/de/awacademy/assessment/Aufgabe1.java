package de.awacademy.assessment;

import de.awacademy.space.Astronaut;
import de.awacademy.test.Test;

public class Aufgabe1 {
    public static boolean isSecure(String password) {
        // TODO: Aufgabe 1a
        /*
            Aufgabe 1a: Implementiere in der Methode isSecure die Prüfung, ob ein gegebenes
            Passwort sicher genug ist. Die Methode muss true zurückgeben, wenn das Password
            sicher ist und false andernfalls.

            Ein Passwort ist sicher genug, wenn alle folgenden Kriterien erfüllt sind:
             - mindestens 8 Zeichen lang
             - enthält entweder eine Ziffer oder ein Ausrufezeichen
             - enthält kein Leerzeichen
        */

        /*
        // Alternative Lösung: Christian
        boolean validLength = password.length() > 7;
        boolean hasExclamationmark = password.contains("!");
        boolean hasDigit = false;
        boolean hasSpace = false;

        // Ziffer prüfen
        char[] splitPassword = password.toCharArray();
        for (char element : splitPassword) {
            if (Character.isDigit(element)) {
                hasDigit = true;
            }
        }

        // Space prüfen
        for (char element : splitPassword) {
            if (Character.isWhitespace(element)) {
                hasSpace = true;
            }
        }

        // Abfrage Space und Digit
        if (validLength) {
            if (hasDigit || hasExclamationmark) {
                if (!hasSpace) {
                    return true;
                }
            }
        }
        return false;

        // Meine Lösung
        // Passwort auf null und Empty prüfen
        if (password == null) {
            return false;
        }

        // Passwort auf Zeichenlänge prüfen
        if (password.length() < 8) {
            return false;
        }

        // Leerzeichen prüfen
        for (int i = 0; i < password.length(); i++) {
            if (password.contains(" ")) {
                return false;
            }
        }

        // Passwort enthält Ziffer oder Ausrufezeichen
        boolean containsDigit = false;
        boolean containsSign = false;

        for (int i = 0; i < password.length(); i++) {
            char digitOrSign = password.charAt(i);

            if (Character.isDigit(digitOrSign)) {
                containsDigit = true;
            }

            if (digitOrSign == '!') {
                containsSign = true;
            }
        }

        if (!containsDigit && !containsSign) {
            return false;
        }

        return true;
        */

        // Lösung: Kurz
        if (password == null || password.length() < 8 || password.contains(" ") || (!password.matches(".*[!\\d].*"))) {
            return false;
        }
        return true;
    }

    public static boolean hasSecurePassword(Astronaut astronaut) {
        // TODO: Aufgabe 1b
        /*
            Aufgabe 1b: Implementiere die Methode hasSecurePassword, welche für ein gegebenes
            Astronaut-Objekt überprüft, ob das darin enthaltene Passwort sicher genug ist.
            Nutze dafür die in Aufgabe 1a implementierte Methode.
            Die Methode muss true zurückgeben, wenn das Password sicher ist und false andernfalls.
        */

        /*
        // Alternative Lösung: Benny
        return isSecure(astronaut.getPassword());
        */

        // Meine Lösung
        return (astronaut != null && isSecure(astronaut.getPassword()));
    }

    public static void main(String[] args) {

        // Beispiele für Passwörter, welche sicher genug sind
        Test.equals(true, isSecure("Hamster1"));
        Test.equals(true, isSecure("842geHeim"));
        Test.equals(true, isSecure("YouCanNotGuessThis!"));

        // Beispiele für Passwörter, welche nicht sicher genug sind
        Test.equals(false, isSecure("you can guess this"));
        Test.equals(false, isSecure("password"));
        Test.equals(false, isSecure("Pasw0rd"));

        // Beispiele für Astronauten mit sicheren Passwörtern
        Test.equals(true, hasSecurePassword(new Astronaut("Yelena", "Laika0055")));
        Test.equals(true, hasSecurePassword(new Astronaut("Janice", "4234seCCret")));
        Test.equals(true, hasSecurePassword(new Astronaut("Mary", "opiuasf!!nKLJASD")));

        // Beispiele für Astronauten mit unsicheren Passwörtern
        Test.equals(false, hasSecurePassword(new Astronaut("Judith", "HackMe...")));
        Test.equals(false, hasSecurePassword(new Astronaut("Barbara", "aA0")));
        Test.equals(false, hasSecurePassword(new Astronaut("Ulf", "mein geheimnis")));
    }
}
