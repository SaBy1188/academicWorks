package de.brightstraining.trainee.week1.day5.aggregation;

public class Auto {
    private Raeder raeder;
    private Tueren tueren;
    private double gewicht;

    public Auto(int anzahlTueren, int anzahlRaeder, int gewicht) {

        this.gewicht = gewicht;
        this.tueren = new Tueren(anzahlTueren);
        this.raeder = new Raeder(anzahlRaeder);

    }


    public double getGesamtGewicht() {


        // raeder auslesen
        double raederGewicht = 0;
        for (Rad rad : this.raeder.getRaeder()) {
            raederGewicht += rad.getGewicht();
        }

        // tueren auslesen
        double tuerenGewicht = 0;
        for (Tuer tuer : this.tueren.getTueren()) {
            tuerenGewicht += tuer.getGewicht();
        }


        // Gesamtgewicht aufaddieren uns ausgeben
        return raederGewicht + tuerenGewicht + this.gewicht;
    }

}