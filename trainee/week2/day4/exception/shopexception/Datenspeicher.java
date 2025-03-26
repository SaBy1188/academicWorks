package de.brightstraining.trainee.week2.day4.exception.shopexception;

public class Datenspeicher extends Produkte {

    // Elternklasse von SSD Speicher & Festplatte
    // Kindklasse von Artikel
    private int groesseInGB;

    public Datenspeicher(String name, String herstellerName,
                         String artikelNummer, int preis,
                         int groesseInGB) {
        super(name,herstellerName,artikelNummer,preis);
        this.groesseInGB = groesseInGB;
    }

    public int getGroesseInGB( ) {
        return groesseInGB;
    }
}