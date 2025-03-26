package de.brightstraining.trainee.week2.day3.computershop.produkte;

import de.brightstraining.trainee.week2.day4.exception.shopexception.Datenspeicher;

public class Festplatten extends Datenspeicher {
    private int drehzahl;


    public Festplatten(String name,String herstellerName,
                       String artikelNummer,int preis,
                       int groesseInGB,int drehzahl) {
        super(name,herstellerName,artikelNummer,preis,groesseInGB);
        this.drehzahl = drehzahl;
    }
    public int getDrehzahl( ) {
        return drehzahl;
    }
}