package de.awacademy.assessment;

import de.awacademy.shop.Category;
import de.awacademy.shop.Product;
import de.awacademy.test.Test;

public class Aufgabe1 {

    public static boolean isValidProductId(String productId) {
        // TODO: Aufgabe 1a
        // Achtung: boolean Anweisung werden von oben nach unten geprüft;
        /*
            Aufgabe 1a: Implementiere in der Methode isValidProductId die Prüfung,
            ob ein gegebener String eine gültige Produkt-ID ist. Die Methode muss
            true zurückgeben, wenn es sich um eine gültige Produkt-ID handelt und
            false andernfalls.

            Jede gültige Produkt-ID beginnt mit dem Großbuchstaben D oder F, gefolgt
            von einer Zahl mit mindestens einer und höchstens fünf Ziffern.

            Falls der Buchstabe D ist, muss die Zahl durch drei teilbar sind, falls
            der Buchstabe F ist, so muss die Zahl durch fünf teilbar sein.
        */

        // TODO: 25.02.23 String auf Inhalt prüfen (boolean);
        boolean idIsNotEmpty = (productId != null) && !productId.isEmpty();

        // TODO: 07.03.2023 IF Anweisung schreiben; Boolesche Anweisung direkt verpacken
        if (idIsNotEmpty) {

            // TODO: 25.02.23 Erste Zeichen prüfen (D, F)
            boolean firstCharIsD = productId.startsWith("D");
            boolean firstCharIsF = productId.startsWith("F");

            // TODO: 25.02.23 ID Länge zwischen 3 und 5 Zeichen prüfen
            boolean productIDLength = (productId.length() >= 2) && (productId.length() <= 6);

            // TODO: 07.03.2023 Prüfen, ob ab Index 1 Ziffern vorhanden sind
            String productIdWithoutLeadingChar = productId.substring(1);

            for (char c : productIdWithoutLeadingChar.toCharArray()) {
                if (!Character.isDigit(c)) {
                    return false;
                }
            }

            // TODO: 07.03.2023 String ab Index 1 in Zahlen konvertieren
            int number;
            try {
                number = Integer.parseInt(productIdWithoutLeadingChar);
            } catch (NumberFormatException exception) {
                return false;
            }

            // TODO: 25.02.23 ID Ziffern durch 3 und 5 teilbar
            boolean productNumD3 = number % 3 == 0;
            boolean productNumF5 = number % 5 == 0;


            // TODO: 07.03.2023 Verschachtelte IF Anweisung für 'D' und 'F'
            if (firstCharIsD && productNumD3 && productIDLength) {
                return true;
            }

            if (firstCharIsF && productNumF5 && productIDLength) {
                return true;
            }
            return false;
        }

        // TODO: 07.03.23 ... am Ende return "true", um Methode zu verlassen
        // Daher darf bei vorherigen Prüfungen nur "false" returned werden, damit die Methode nicht vorzeitig verlassen wird
        return false;
    }




    public static boolean hasValidId(Product product) {
        // TODO: Aufgabe 1b
        /*
            Aufgabe 1b: Implementiere die Methode hasValidId, welche für ein gegebenes
            Product-Objekt überprüft, ob die darin enthaltene ID gültig ist.

            Nutze dafür die in Aufgabe 1a implementierte Methode.

            Die Methode muss true zurückgeben, wenn die ID gültig ist und false andernfalls.
        */

        if (isValidProductId(product.getId())) {
            return true;
        }
        return false;

        /*
        // Alternative
            if (product == null || product.getId() == null) {
                return false;
            }

            String productId = product.getId();
            return isValidProductId(productId);
        */
    }


    public static void main(String[] args) {
        // Testlauf Aufgabe 1a)

        System.out.println("Aufgabe 1a");
        // Beispiele für gültige Produkt-IDs
        Test.equals(true, isValidProductId("D6"));
        Test.equals(true, isValidProductId("F10"));
        Test.equals(true, isValidProductId("D24"));
        Test.equals(true, isValidProductId("F250"));
        Test.equals(true, isValidProductId("D30000"));
        Test.equals(true, isValidProductId("F30000"));

        // Beispiele für ungültige Produkt-IDs
        Test.equals(false, isValidProductId(""));
        Test.equals(false, isValidProductId("6D"));
        Test.equals(false, isValidProductId("F"));
        Test.equals(false, isValidProductId("Hallo"));
        Test.equals(false, isValidProductId("F 10"));
        Test.equals(false, isValidProductId("D24 "));
        Test.equals(false, isValidProductId("D-24"));
        Test.equals(false, isValidProductId("d24"));
        Test.equals(false, isValidProductId("F300000"));


        // Testläufe für 1b)

        System.out.println("Aufgabe 1b");
        // Beispiele für Produkte mit gültigen IDs
        Test.equals(true, hasValidId(new Product("F25", "Tomato", Category.FOOD)));
        Test.equals(true, hasValidId(new Product("D240", "Java", Category.SOFTWARE)));
        Test.equals(true, hasValidId(new Product("F1000", "Shirt", Category.CLOTHES)));
        Test.equals(true, hasValidId(new Product("Test Product", Category.TOOLS)));

        // Beispiele für Produkte mit ungültigen IDs
        Test.equals(false, hasValidId(new Product("P25", "Pineapple", Category.FOOD)));
        Test.equals(false, hasValidId(new Product("D241", "Word", Category.SOFTWARE)));
        Test.equals(false, hasValidId(new Product("no-id", "Skirt", Category.CLOTHES)));
    }
}