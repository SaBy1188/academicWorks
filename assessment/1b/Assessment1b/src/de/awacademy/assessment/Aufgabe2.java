package de.awacademy.assessment;

import de.awacademy.shop.Category;
import de.awacademy.shop.Product;
import de.awacademy.test.Test;

import java.util.ArrayList;
import java.util.List;

public class Aufgabe2 {

    public static List<Product> excludeCategory(List<Product> products, Category category) {
        // TODO: Aufgabe 2a
        /*
            Aufgabe 2a: Implementiere die Methode excludeCategory, welche für eine gegebene
            Liste von Produkten und eine gegebene Kategorie eine Liste zurück gibt, welche
            alle Produkte mit einer anderen als der gegebenen Kategorie enthält.

            Die neue Liste muss die Reihenfolge der Produkte beibehalten.

            Die ursprüngliche Liste darf dabei nicht verändert werden.
         */
        // neue Liste erstellen
        List<Product> excludeCategoryList = new ArrayList<>();

        for (Product product : products) {
            if (product.getCategory() != category)
            {
                excludeCategoryList.add(product);
            }
        }

        return excludeCategoryList;
    }

    private static List<Product> excludeCategories(List<Product> products, List<Category> categories) {
        // TODO: Aufgabe 2b
        /*
            Aufgabe 2b: Implementiere die Methode excludeCategories, welche für eine gegebene
            Liste von Produkten und eine gegebene Liste von Kategorien eine Liste zurück gibt,
            welche nur die Produkte enthält, welche zu keiner der gegebenen Kategorien gehören.

            Die neue Liste muss die Reihenfolge der Produkte beibehalten.

            Die ursprüngliche Liste darf dabei nicht verändert werden.
         */
        List<Product> excludedCategories = new ArrayList<>();
        for (Product product : products) {
            if (!categories.contains(product.getCategory())) {
                excludedCategories.add(product);
            }
        }
        return excludedCategories;
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


        // Beispiele
        System.out.println("Aufgabe 2a");
        Test.equals(
                List.of(bread, apple, windows, intelliJ, firefox, office),
                excludeCategory(allProducts, Category.CLOTHES)
        );

        Test.equals(
                List.of(pants, gloves, windows, sweatshirt, socks, intelliJ, firefox, office),
                excludeCategory(allProducts, Category.FOOD)
        );

        Test.equals(
                List.of(bread, pants, gloves, apple, sweatshirt, socks),
                excludeCategory(allProducts, Category.SOFTWARE)
        );

        Test.equals(
                allProducts,
                excludeCategory(allProducts, Category.TOOLS)
        );

        // Beispiele
        System.out.println("Aufgabe 2b");
        Test.equals(
                List.of(bread, apple),
                excludeCategories(allProducts, List.of(Category.CLOTHES, Category.SOFTWARE))
        );

        Test.equals(
                List.of(windows, intelliJ, firefox, office),
                excludeCategories(allProducts, List.of(Category.CLOTHES, Category.FOOD))
        );

        Test.equals(
                List.of(bread, pants, gloves, apple, sweatshirt, socks),
                excludeCategories(allProducts, List.of(Category.SOFTWARE))
        );

        Test.equals(
                List.of(),
                excludeCategories(allProducts, List.of(Category.FOOD, Category.CLOTHES, Category.SOFTWARE))
        );

        Test.equals(
                allProducts,
                excludeCategories(allProducts, List.of(Category.TOOLS))
        );

        Test.equals(
                allProducts,
                excludeCategories(allProducts, List.of())
        );
    }

}
