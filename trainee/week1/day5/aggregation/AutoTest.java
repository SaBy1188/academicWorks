package de.brightstraining.trainee.week1.day5.aggregation;

public class AutoTest {
    public static void main(String[] args) {


        //erstelle Auto
        Auto meinAuto = new Auto(4, 4, 1000);

        double gesamtGewicht = meinAuto.getGesamtGewicht();
        System.out.println("Das Gesamtgewicht beträgt: " + gesamtGewicht + "kg");

    }

}