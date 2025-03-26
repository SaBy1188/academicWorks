package de.brightstraining.trainee.week2.day2.interfaces.computershop.produkte;

import de.brightstraining.trainee.week2.day2.interfaces.computershop.Artikel;

public class Maus implements Artikel {
    private String name = "";
    private String herstellerName = "";
    private int artikelNummer = 0;
    private float preis = 0.0F;

    private byte    tastenAnzahl;
    private boolean drahtlos;


    public Maus(String name,String herstellerName,int artikelNummer,float preis,byte tastenAnzahl,boolean drahtlos) {
        this.name = name;
        this.herstellerName = herstellerName;
        this.artikelNummer = artikelNummer;
        this.preis = preis;
        this.tastenAnzahl = tastenAnzahl;
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

    public byte getTastenAnzahl( ) {
        return tastenAnzahl;
    }

    public boolean isDrahtlos( ) {
        return drahtlos;
    }
}