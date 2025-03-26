package de.brightstraining.trainee.week1.day5.aggregation;


public class Raeder {
    private Rad[] raeder;

    public Raeder(int anzahlRaeder) {

        if (anzahlRaeder > 4) {
            throw new IllegalArgumentException("Es sind maximal 4 Räder möglich");
        }

        Rad[] raeder = new Rad[anzahlRaeder];

        for (int i = 0; i < raeder.length; i++) {
            raeder[i] = new Rad();
        }

        this.raeder = raeder;

    }


    public Rad[] getRaeder() {
        return raeder;
    }
}