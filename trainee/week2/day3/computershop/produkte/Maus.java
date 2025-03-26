package de.brightstraining.trainee.week2.day3.computershop.produkte;

import de.brightstraining.trainee.week2.day3.computershop.Artikel;
public class Maus extends Artikel {
    private int    tastenAnzahl;
    private boolean drahtlos;


    public Maus(String name,String herstellerName,String artikelNummer,int preis,int tastenAnzahl,boolean drahtlos) {
        super(name,herstellerName,artikelNummer,preis);
        this.tastenAnzahl = tastenAnzahl;
        this.drahtlos = drahtlos;
    }


    public int getTastenAnzahl( ) {
        return tastenAnzahl;
    }

    public boolean isDrahtlos( ) {
        return drahtlos;
    }
}