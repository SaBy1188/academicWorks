package de.brightstraining.trainee.week2.day2.interfaces.computershop.produkte;

import de.brightstraining.trainee.week2.day2.interfaces.computershop.Artikel;

public class Prozessoren implements Artikel {
    private String name = "";
    private String herstellerName = "";
    private int artikelNummer = 0;
    private float preis = 0.0F;

    private int frequenz;


    public Prozessoren(String name,String herstellerName,int artikelNummer,float preis,int frequenz) {
        this.name = name;
        this.herstellerName = herstellerName;
        this.artikelNummer = artikelNummer;
        this.preis = preis;
        this.frequenz = frequenz;
    }


    public String getName( ) {
        return name;
    }

    public String getHerstellerName( ) {
        return herstellerName;
    }

    public int getArtikelNummer( ) {
        return artikelNummer;
    }

    public float getPreis( ) {
        return preis;
    }

    public int getFrequenz( ) {
        return frequenz;
    }
}