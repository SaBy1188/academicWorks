package de.brightstraining.trainee.week2.day2.interfaces.computershop.produkte;


import de.brightstraining.trainee.week2.day2.interfaces.computershop.Artikel;

public class Tastaturen implements Artikel {
    private String name = "";
    private String herstellerName = "";
    private int artikelNummer = 0;
    private float preis = 0.0F;

    private boolean nummernblock;
    private boolean drahtlos;


    public Tastaturen(String name,String herstellerName,int artikelNummer,float preis,boolean nummernblock,boolean drahtlos) {
        this.name = name;
        this.herstellerName = herstellerName;
        this.artikelNummer = artikelNummer;
        this.preis = preis;
        this.nummernblock = nummernblock;
        this.drahtlos = drahtlos;
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

    public boolean isNummernblock( ) {
        return nummernblock;
    }

    public boolean isDrahtlos( ) {
        return drahtlos;
    }
}