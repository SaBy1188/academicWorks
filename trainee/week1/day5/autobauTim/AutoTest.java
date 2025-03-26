package de.brightstraining.trainee.week1.day5.autobauTim;

public class AutoTest {
    public static void main(String[] args) {
        Rad[] raeder = new Rad[] {
                new Rad(100),
                new Rad(100),
                new Rad(100),
                new Rad(100)
        };

        Tuer[] tueren = new Tuer[] {
            new Tuer(150),
            new Tuer(150),
            new Tuer(150),
            new Tuer(150)
        };

        Auto auto = new Auto(raeder, tueren, 1000.0);
        System.out.println(auto.berechneGesamtgewicht());
    }
}