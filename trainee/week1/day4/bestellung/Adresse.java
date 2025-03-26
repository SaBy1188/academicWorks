package de.brightstraining.trainee.week1.day4.bestellung;

public class Adresse {
    // Attribute
    private String strasseNr;
    private String plz;
    private String ort;


    // Konstruktor
    public Adresse(String strasseNr, String plz, String ort) {
        this.strasseNr = strasseNr;
        this.plz = plz;
        this.ort = ort;
    }

    public Adresse(Adresse source) {
        this.strasseNr = source.strasseNr;
        this.plz = source.plz;
        this.ort = source.ort;
    }


    // Getter & Setter
    public String getStrasseNr() {
        return strasseNr;
    }
    public void setStrasseNr(String strasseNr) {
        this.strasseNr = strasseNr;
    }

    public String getPlz() {
        return plz;
    }
    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }
    public void setOrt(String ort) {
        this.ort = ort;
    }

    // ToString Methode
    @Override
    public String toString() {
        return "Adresse{" +
                "strasseNr='" + strasseNr + '\'' +
                ", plz='" + plz + '\'' +
                ", ort='" + ort + '\'' +
                '}';
    }
}