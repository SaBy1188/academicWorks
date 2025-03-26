package de.brightstraining.trainee.week1.day5.aggregation;
public class Tueren {

    private Tuer[] tueren;


    public Tueren(int anzahlTueren) {

        if (anzahlTueren > 4) {
            throw new IllegalArgumentException("Es sind maximal 4 Türen möglich");
        }

        Tuer[] tueren = new Tuer[anzahlTueren];
        for (int i = 0; i < tueren.length; i++) {
            tueren[i] = new Tuer();
        }

        this.tueren = tueren;
    }


    public Tuer[] getTueren() {
        return tueren;
    }
}