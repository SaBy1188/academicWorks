package de.brightstraining.trainee.week2.day2.testdrivendev.kassieren;

public class Produkt {

    // Schritt 1: Instanzvariablen anlegen
    private String name;
    private int preis;


    // Konstruktor
    // Schritt 3: Konstruktor vervollständigen um "this"
    public Produkt(String name, int preis) {
        this.name = name;
        this.preis = preis;
    }


    // Schritt 2: Variablen anpassen
    public String getName() {
        return name;
    }
    public int getPreis() {
        return preis;
    }

    // Schritt 2: Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }
}