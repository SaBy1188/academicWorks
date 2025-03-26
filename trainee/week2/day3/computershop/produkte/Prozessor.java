package de.brightstraining.trainee.week2.day3.computershop.produkte;

import de.brightstraining.trainee.week2.day3.computershop.Artikel;

public class Prozessor extends Artikel {
    private int frequenzInGHZ;


    public Prozessor(String name, String herstellerName, String artikelNummer, int preis, int frequenzInGHZ) {
        super(name,herstellerName,artikelNummer,preis);
        this.frequenzInGHZ = frequenzInGHZ;
    }

    public int getFrequenzInGHZ() {
        return frequenzInGHZ;
    }
}