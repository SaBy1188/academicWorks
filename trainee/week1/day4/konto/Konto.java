package de.brightstraining.trainee.week1.day4.konto;

public class Konto {

    private int kontostand;


    // Konstruktor
    public Konto(int kontostand) {
        this.kontostand = kontostand;
    }


    // Getter
    public int getKontostand( ) {
        return kontostand;
    }


    // Setter
    public void setKontostand(int kontostand) {
        this.kontostand = kontostand;
    }


    // Override toString Methode
    // Automatisch einfügen lassen:
    // -> Code -> Generate.. -> toString -> Methode auswählen
    @Override
    public String toString( ) {
        return "Konto{" + "kontostand=" + kontostand + '}';
    }
}