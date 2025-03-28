package de.awacademy.assessment;

import de.awacademy.shop.Category;
import de.awacademy.shop.Product;
import de.awacademy.test.Test;

public class Aufgabe1_Nachhilfe {

    public static boolean isValidProductId(String productId) {
        // TODO: Aufgabe 1a
        /*
            Aufgabe 1a: Implementiere in der Methode isValidProductId die Prüfung,
            ob ein gegebener String eine gültige Produkt-ID ist. Die Methode muss
            true zurückgeben, wenn es sich um eine gültige Produkt-ID handelt und
            false andernfalls.

            Jede gültige Produkt-ID beginnt mit dem Großbuchstaben D oder F, gefolgt
            von einer Zahl mit mindestens einer und höchstens fünf Ziffern.

            Falls der Buchstabe D ist, muss die Zahl durch drei teilbar ist, falls
            der Buchstabe F ist, so muss die Zahl durch fünf teilbar sein.
        */

        // TODO: 25.02.23 1. String auf Inhalt prüfen (boolean);
        boolean idIsEmpty = (productId == null || productId.isEmpty());
        // boolean idIsEmpty = (productId == null || productId.length() < 2);

        if (idIsEmpty) {
            return false;
        }

        // TODO: 25.02.23 2. Erste Zeichen auslesen (D, F)
        boolean idStartsWithDOrF = productId.startsWith("D") || productId.startsWith("F");

        if (!idStartsWithDOrF) {
            return false;
        }

            /* Alternative
            char firstChar = productId.charAt(0);
            if (firstChar != 'D' && firstChar != 'F') {
                return false;
            }

            true && true = true
            true && false = false
            false && false = false

            true || true = true
            true || false = true
            false || false = false

            true ^ true = false
            false ^ false = false
            true ^ false = true
        */

        // TODO: 25.02.23 3. ID Länge zwischen 3 und 5 Zeichen
        boolean valideLength = productId.length() >= 2 && productId.length() <= 6;

        if (!valideLength) {
            return false;
        }

        // TODO: 25.02.23 4. ID Ziffern durch 3 und 5 teilbar
        // Alternative über TryCatch
        int idToNum;
        try {
            idToNum = Integer.parseInt(productId.substring(1));
        } catch (NumberFormatException exception) {
            // Wenn Exception geschmissen werden, darauf klicken, um zu erfahren, um welche es sich handelt.
            // s. Confluence (wichtigste Exceptions) https://sabrinlouisa.atlassian.net/wiki/spaces/DEV/pages/1472659465/Exceptions
            return false;
        }


        /*
            // Alternative über ForEach
            for (char c : productId.substring(1).toCharArray()) {
                if (!Character.isDigit(c)) {
                    return false;
                }
            }


            // Alternative nicht verschachtelt
            String idToNum = productId.substring(1);
            int number;
            try {
                number = Integer.parseInt(idToNum);
            } catch (NumberFormatException e) {
                return false;
            }
        */

        // TODO: 07.03.23 Wenn 'D' oder 'F', dann ...
        boolean productNumD3 = idToNum % 3 == 0;
        boolean productNumF5 = idToNum % 5 == 0;

        if (productId.startsWith("D") && !productNumD3) {
            return false;
        }
        if (productId.startsWith("F") && !productNumF5) {
            return false;
        }
        /*
        // Alternative IF Anweisung
            if (firstChar == 'D') {
                return number % 3 == 0;
            } else {
                return number % 5 == 0;
            }
        */

        // TODO: 07.03.23 ... am Ende return "true", um Methode zu verlassen
        // Daher darf bei vorherigen Prüfungen nur "false" returned werden, damit die Methode nicht vorzeitig verlassen wird
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
        if (isValidProductId(product.getId()) && product != null) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        // Testläufe für 1a)

        System.out.println("Aufgabe 1a");
        // Beispiele für gültige Produkt-IDs
        Test.equals(false, isValidProductId(""));
        Test.equals(false, isValidProductId(null));
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