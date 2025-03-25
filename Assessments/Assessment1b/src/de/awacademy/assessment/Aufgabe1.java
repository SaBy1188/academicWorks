package de.awacademy.assessment;

import de.awacademy.shop.Category;
import de.awacademy.shop.Product;
import de.awacademy.test.Test;

import javax.sound.midi.MidiFileFormat;

public class Aufgabe1 {

    public static boolean isValidProductId(String productId) {
        // TODO: Aufgabe 1a
        /*
            Aufgabe 1a: Implementiere in der Methode isValidProductId die Prüfung,
            ob ein gegebener String eine gültige Produkt-ID ist. Die Methode muss
            true zurückgeben, wenn es sich um eine gültige Produkt-ID handelt und
            false andernfalls.

            Jede gültige Produkt-ID beginnt mit einer Zahl mit mindestens einer und
            höchstens sechs Ziffern, gefolgt von dem Großbuchstaben Z oder S.

            Falls der Buchstabe Z ist, muss die Zahl durch zwei teilbar sein, falls
            der Buchstabe S ist, so muss die Zahl durch sieben teilbar sein.
         */


        // TODO: 13.03.2023  null und Empty prüfen
        if (productId == null || productId.isEmpty()) {
            return false;
        }

        // TODO: 13.03.2023 productID Länge prüfen
        if (productId.length() < 2 || productId.length() > 7) {
            return false;
        }

        // TODO: 13.03.2023 Zahlen prüfen
        for (int i = 0; i < productId.length() - 1; i++) {
            char testNumber = productId.charAt(i);
            if (testNumber < '0' || testNumber > '9') {
//            if (!(testNumber == '0' || testNumber == '1' || testNumber == '2' || testNumber == '3' || testNumber == '4' ||
//                    testNumber == '5' || testNumber == '6' || testNumber == '7' || testNumber == '8' || testNumber == '9')) {
                return false;
            }
        }

        // TODO: 13.03.2023 Prüfe auf letzten Buchstabe
        boolean lastLetterZ = productId.endsWith("Z");
        boolean lastLetterS = productId.endsWith("S");

        if (!(lastLetterZ || lastLetterS)) {
            return false;
        }

        /* Alternative
        char lastLetter = productId.charAt(productId.length() - 1);
                if (lastLetter != 'Z' && lastLetter != 'S') {
                    return false;
                }
        */

        // TODO: 13.03.2023 String in Integer umwandeln, try catch
        try {
            int parseIDNum = Integer.parseInt(productId.substring(0, productId.length() - 1));

            if (lastLetterZ && parseIDNum % 2 != 0) {
                return false;
            }

            if (lastLetterS && parseIDNum % 7 != 0) {
                return false;
            }

        } catch (NumberFormatException numberFormatException) {
            return false;
        }

        // TODO: 13.03.2023  true zurückgegeben
        return true;
    }


    public static boolean hasValidId(Product product) {
        // TODO: Aufgabe 1b
        /*
            Aufgabe 1b: Implementiere die Methode hasValidId, welche für ein gegebenes
            Product-Objekt überprüft, ob die darin enthaltene ID gültig ist.

            Nutze dafür die in Aufgabe 1a implementierte Methode.

            Die Methode muss true zurückgeben, wenn die ID gültig ist und false andernfalls.
        */

        return (product != null && isValidProductId(product.getId()));
    }

    public static void main(String[] args) {

        System.out.println("Aufgabe 1a");
        // Beispiele für gültige Produkt-IDs
        Test.equals(true, isValidProductId("6Z"));
        Test.equals(true, isValidProductId("14S"));
        Test.equals(true, isValidProductId("24Z"));
        Test.equals(true, isValidProductId("777S"));
        Test.equals(true, isValidProductId("30000Z"));
        Test.equals(true, isValidProductId("4788S"));

        // Beispiele für ungültige Produkt-IDs
        Test.equals(false, isValidProductId(""));
        Test.equals(false, isValidProductId("Z6"));
        Test.equals(false, isValidProductId("F"));
        Test.equals(false, isValidProductId("Hallo"));
        Test.equals(false, isValidProductId("10 Z"));
        Test.equals(false, isValidProductId("24Z "));
        Test.equals(false, isValidProductId("24-Z"));
        Test.equals(false, isValidProductId("24z"));
        Test.equals(false, isValidProductId("7777777S"));

        System.out.println("Aufgabe 1b");
        // Beispiele für Produkte mit gültigen IDs
        Test.equals(true, hasValidId(new Product("Test Product", Category.TOOLS)));
        Test.equals(true, hasValidId(new Product("6Z", "Tomato", Category.FOOD)));
        Test.equals(true, hasValidId(new Product("140S", "Java", Category.SOFTWARE)));
        Test.equals(true, hasValidId(new Product("1000Z", "Shirt", Category.CLOTHES)));

        // Beispiele für Produkte mit ungültigen IDs
        Test.equals(false, hasValidId(new Product("25P", "Pineapple", Category.FOOD)));
        Test.equals(false, hasValidId(new Product("241Z", "Word", Category.SOFTWARE)));
        Test.equals(false, hasValidId(new Product("no-id", "Skirt", Category.CLOTHES)));
    }
}
