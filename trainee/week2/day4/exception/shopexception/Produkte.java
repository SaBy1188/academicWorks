package de.brightstraining.trainee.week2.day4.exception.shopexception;
public class Produkte {

    // Elternklasse

    private String name;

    private String herstellerName;

    private String artikelNummer;

    private int preis;


    public Produkte(String name,String herstellerName,String artikelNummer,int preis) {
        this.name = name;
        this.herstellerName = herstellerName;
        this.artikelNummer = artikelNummer;
        this.preis = preis;
    }


    public String getName( ) {
        return name;
    }

    public String getHerstellerName( ) {
        return herstellerName;
    }

    public String getArtikelNummer( ) {
        return artikelNummer;
    }

    public int getPreis( ) {
        return preis;
    }
}