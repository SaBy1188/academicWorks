package de.brightstraining.trainee.week2.day4.exception.shopexception.produkte;

import de.brightstraining.trainee.week2.day4.exception.shopexception.Produkte;

public class Maus extends Produkte {
    private byte    tastenAnzahl;
    private boolean drahtlos;


    public Maus(String name,String herstellerName,String artikelNummer,int preis,byte tastenAnzahl,boolean drahtlos) {
        super(name,herstellerName,artikelNummer,preis);
        this.tastenAnzahl = tastenAnzahl;
        this.drahtlos = drahtlos;
    }


    public byte getTastenAnzahl( ) {
        return tastenAnzahl;
    }

    public boolean isDrahtlos( ) {
        return drahtlos;
    }
}