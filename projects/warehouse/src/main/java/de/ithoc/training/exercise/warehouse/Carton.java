package de.ithoc.training.exercise.warehouse;

import java.util.ArrayList;
import java.util.List;

public class Carton {
    private Size size;
    private List<Item> items = new ArrayList<>();

    public Carton(Size size) {
        this.size = size;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public int getItemCount() {
        return items.size();
    }

    public Size getSize() {
        return size;
    }
}
