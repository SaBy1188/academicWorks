package de.brightstraining.trainee.week2.day2.testdrivendev.kassieren;

import java.util.ArrayList;

public class Kasse {

    // Schritt 4: Array hinzufügen
    private ArrayList<Produkt>produkte = new ArrayList<>();
    public void scan(Produkt produkt) {
        // Schritt 5: Methode erweitern
        produkte.add(produkt);
    }

    // Schritt 6: Methode erweitern
    public int getZwischensumme() {
        int zwischensumme = 0;

        for(Produkt produkt : produkte) {
            zwischensumme += produkt.getPreis();
        }
        return zwischensumme;
    }
}