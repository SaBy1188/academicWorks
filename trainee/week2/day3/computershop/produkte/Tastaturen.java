package de.brightstraining.trainee.week2.day3.computershop.produkte;

import de.brightstraining.trainee.week2.day3.computershop.Artikel;

public class Tastaturen extends Artikel {

    private boolean nummernblock;
    private boolean drahtlos;


    public Tastaturen(String name,String herstellerName,String artikelNummer,int preis,boolean nummernblock,boolean drahtlos) {
        super(name,herstellerName,artikelNummer,preis);
        this.nummernblock = nummernblock;
        this.drahtlos = drahtlos;
    }


    public boolean isNummernblock( ) {
        return nummernblock;
    }

    public boolean isDrahtlos( ) {
        return drahtlos;
    }
}