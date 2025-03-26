package de.brightstraining.trainee.week1.day4.bestellung;

public class Bestellung {

    // Attribute
    private long    bestellNr;
    private String  produkt;
    private Adresse lieferAdresse;
    private Adresse rechnungsAdresse;


    // Konstruktor
    public Bestellung(long bestellNr,String produkt,Adresse lieferAdresse,Adresse rechnungsAdresse) {
        this.bestellNr = bestellNr;
        this.produkt = produkt;
        this.rechnungsAdresse = new Adresse(rechnungsAdresse);
        this.lieferAdresse = new Adresse(lieferAdresse);
    }


    // Getter & Setter
    public long getBestellNr( ) {
        return bestellNr;
    }

    public void setBestellNr(long bestellNr) {
        this.bestellNr = bestellNr;
    }

    public String getProdukt( ) {
        return produkt;
    }

    public void setProdukt(String produkt) {
        this.produkt = produkt;
    }

    public Adresse getLieferAdresse( ) {
        return new Adresse(lieferAdresse);
    }

    public void setLieferAdresse(Adresse lieferAdresse) {
        this.lieferAdresse = new Adresse(lieferAdresse);
    }

    public Adresse getRechnungsAdresse( ) {
        return new Adresse(rechnungsAdresse);
    }

    public void setRechnungsAdresse(Adresse rechnungsAdresse) {
        this.rechnungsAdresse = new Adresse(rechnungsAdresse);
    }


    @Override
    public String toString( ) {
        return "Bestellung{" + "bestellNr=" + bestellNr + ", produkt='" + produkt + '\'' + ", lieferAdresse=" + lieferAdresse + ", rechnungsAdresse=" + rechnungsAdresse + '}';
    }
}