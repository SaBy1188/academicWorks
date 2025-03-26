package de.brightstraining.trainee.week2.day3.computershop.exceptions;

public class UngueltigerPreisException extends Exception {
    private int preis;
    private String artikel;

    public UngueltigerPreisException(String fehlermeldung,
                                         int preis,String artikel) {
        super(fehlermeldung);
        this.preis = preis;
        this.artikel = artikel;
    }

    public int getPreis() { return preis; }
    public String getArtikel( ) { return artikel; }

    @Override public String toString( ) {
        return "UngueltigerPreisException{"
                + "preis=" + preis + ", artikel='"
                + artikel + '\'' + '}';
    }
}