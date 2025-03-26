package de.brightstraining.trainee.week2.day3.computershop.produkte;

import de.brightstraining.trainee.week2.day4.exception.shopexception.Datenspeicher;

public class SSDSpeicher extends Datenspeicher {

    public SSDSpeicher(String name, String herstellerName,
                       String artikelNummer, int preis,
                       int groesseInGB) {
        super(name,herstellerName,artikelNummer,preis,groesseInGB);
    }
}