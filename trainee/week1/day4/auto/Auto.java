package de.brightstraining.trainee.week1.day4.auto;

public class Auto {
    // Eigenschaften
    private String farbe;
    private int    leistung;
    private String nameFahrer;


    // Konstruktor 1
    public Auto() {
        this.farbe = "";
        this.leistung = 0;
        this.nameFahrer = "";
    }

    // Konstruktor 2
    public Auto(String farbe, int leistung, String nameFahrer) {
        this.farbe = farbe;
        this.leistung = leistung;
        this.nameFahrer = nameFahrer;
    }

    // Konstruktor 3
    public Auto(String nameFahrer) {
        this.farbe = "rot";
        this.leistung = 80;
        this.nameFahrer = nameFahrer;
    }

    // Getter
    public String getFarbe() {
        return farbe;
    }

    public int getLeistung() {
        return leistung;
    }

    public String getNameFahrer() {
        return nameFahrer;
    }

    // Setter
    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public void setLeistung(int leistung) {
        this.leistung = leistung;
    }

    public void setNameFahrer(String nameFahrer) {
        this.nameFahrer = nameFahrer;
    }


    // toString

    @Override
    public String toString() {
        return "Auto{" + "farbe='" + farbe + '\'' + ", leistung=" + leistung + ", nameFahrer='" + nameFahrer + '\'' + '}';
    }
}