package de.brightstraining.trainee.week1.day5.autobauTim;

public class Auto {

    private Rad[] raeder;

    private Tuer[] tueren;

    private double gewicht;


    public Auto(Rad[] raeder, Tuer[] tueren, double gewicht) {
        this.raeder = raeder;
        this.tueren = tueren;
        this.gewicht = gewicht;
    }

    public double berechneGesamtgewicht() {
        double gesamtGewicht = gewicht;

        for (Rad rad : raeder) {
            gesamtGewicht += rad.getGewicht();
        }

        for (Tuer tuer : tueren) {
            gesamtGewicht += tuer.getGewicht();
        }

        return gesamtGewicht;
    }
}