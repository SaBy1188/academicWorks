package de.brightstraining.trainee.week1.day4.bibliothek;

public class Buch {
    // Eigenschaften (Attribute: Titel usw).
    private String  titel;
    private String  autor;
    private String  genre;
    private int     seitenzahl;
    private boolean istAusgeliehen;
    // aktuell, Standard default Einstellung


    // Konstruktor: Template
    public Buch(String titel,String autor,int seitenzahl) {
        this.titel = titel;
        this.autor = autor;
        this.seitenzahl = seitenzahl;
        this.istAusgeliehen = false;
    }

    // Getter
    public boolean getIstAusgeliehen( ) {
        return istAusgeliehen;
    }

    // Setter
    public void setIstAusgeliehen(boolean istAusgeliehen) {
        this.istAusgeliehen = istAusgeliehen;
    }
}