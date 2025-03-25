package de.ithoc.training.exercise.warehouse;

public class Item {
    private int itemNumber;
    private String name;
    private double price;

    public Item(int itemNumber, String name, double price) {
        this.itemNumber = itemNumber;
        this.name = name;
        this.price = price;
    }
    public int getItemNumber() {
        return itemNumber;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
