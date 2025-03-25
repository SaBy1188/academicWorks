package de.ithoc.training.exercise.warehouse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Erstelle eine Lagerhaltung mit einem Lager (Warehouse) für Gegenstände (Items) und Verpackungen (Cartons).
 *
 * Ein Carton hat drei unterschiedliche, aber feste größen S, M oder L. Verwende dafür ein Enum.
 * Das Item besitzt eine eindeutige Nummer, einen Namen und einen Preis.
 * Das Warehouse lagert seine Items im Lager und referenziert mit der Item-Nr. darauf.
 *
 * Der Einfachheit halber gibt es pro Item-Nr. nur ein Item.
 */
public class Warehouse {
    private Map<Integer, Item> itemMap;
    private List<Carton> cartonList;

    public Warehouse() {
        itemMap = new HashMap<>();
        cartonList = new ArrayList<>();
    }

    public void addItem(Item item) {
        itemMap.put(item.getItemNumber(), item);
    }

    public void removeItem(Item item) {
        itemMap.remove(item.getItemNumber());
    }

    public Item getItem(int itemNumber) {
        return itemMap.get(itemNumber);
    }

    public void addCarton(Carton carton) {
        cartonList.add(carton);
    }

    public void removeCarton(Carton carton) {
        cartonList.remove(carton);
    }

    public List<Carton> getCartons() {
        return cartonList;
    }
}