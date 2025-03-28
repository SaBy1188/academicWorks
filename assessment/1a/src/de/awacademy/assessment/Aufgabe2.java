package de.awacademy.assessment;

import de.awacademy.shop.Category;
import de.awacademy.shop.Product;
import de.awacademy.test.Test;

import java.util.List;

public class Aufgabe2 {

    public static List<Product> findByCategory(List<Product> products, Category category) {
        // TODO: 08.03.23 Aufgabe 1a
        /*
            Aufgabe 2a: Implementiere die Methode findByCategory, welche für eine gegebene
            Liste von Produkten und eine gegebene Kategorie eine neue Liste zurückgibt,
            welche nur die Produkte mit der gegebenen Kategorie enthält.

            Die neue Liste muss die Reihenfolge der Produkte beibehalten.

            Die ursprüngliche Liste darf dabei nicht verändert werden.
        */

        return products;
    }

    private static int countByCategory(List<Product> products, Category category) {
        // TODO: 08.03.23 Aufgabe 2b
        /*
            Aufgabe 2b: Implementiere die Methode countByCategory, welche für eine gegebene
            Liste von Produkten und eine gegebene Kategorie die Anzahl der Produkte
            in der Liste mit der Kategorie zurückgibt.

            Die ursprüngliche Liste darf dabei nicht verändert werden.
        */

        // Einzeiler; Optimale Lösung
        return findByCategory(products, category).size();
    }

    public static void main(String[] args) {

        Product bread = new Product("Bread", Category.FOOD);
        Product pants = new Product("Pants", Category.CLOTHES);
        Product gloves = new Product("Gloves", Category.CLOTHES);
        Product apple = new Product("Apple", Category.FOOD);
        Product windows = new Product("Windows", Category.SOFTWARE);
        Product sweatshirt = new Product("Sweatshirt", Category.CLOTHES);
        Product socks = new Product("Socks", Category.CLOTHES);
        Product intelliJ = new Product("IntelliJ", Category.SOFTWARE);
        Product firefox = new Product("Firefox", Category.SOFTWARE);
        Product office = new Product("Office", Category.SOFTWARE);

        List<Product> allProducts = List.of(
                bread, pants, gloves, apple, windows, sweatshirt,
                socks, intelliJ, firefox, office
        );

        /*
            Aufgabe 2a: Implementiere die Methode findByCategory, welche für eine gegebene
            Liste von Produkten und eine gegebene Kategorie eine neue Liste zurückgibt,
            welche nur die Produkte mit der gegebenen Kategorie enthält.

            Die neue Liste muss die Reihenfolge der Produkte beibehalten.

            Die ursprüngliche Liste darf dabei nicht verändert werden.
         */


        // Beispiele
        System.out.println("Aufgabe 2a");
        Test.equals(
                List.of(pants, gloves, sweatshirt, socks),
                findByCategory(allProducts, Category.CLOTHES)
        );

        Test.equals(
                List.of(bread, apple),
                findByCategory(allProducts, Category.FOOD)
        );

        Test.equals(
                List.of(windows, intelliJ, firefox, office),
                findByCategory(allProducts, Category.SOFTWARE)
        );

        Test.equals(
                List.of(),
                findByCategory(allProducts, Category.TOOLS)
        );


        /*
            Aufgabe 2b: Implementiere die Methode countByCategory, welche für eine gegebene
            Liste von Produkten und eine gegebene Kategorie die Anzahl der Produkte
            in der Liste mit der Kategorie zurückgibt.

            Die ursprüngliche Liste darf dabei nicht verändert werden.
         */



        // Beispiele
        System.out.println("Aufgabe 2b");
        Test.equals(
                2,
                countByCategory(allProducts, Category.FOOD)
        );

        Test.equals(
                4,
                countByCategory(allProducts, Category.CLOTHES)
        );

        Test.equals(
                4,
                countByCategory(allProducts, Category.SOFTWARE)
        );

        Test.equals(
                0,
                countByCategory(allProducts, Category.TOOLS)
        );
    }

}