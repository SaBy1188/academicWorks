package de.brightstraining.prestudies.week4;

public class Main {
    public static void main(String[] args) {
        Taschenrechner meinRechner = new Taschenrechner();

        meinRechner.plus(8);
        meinRechner.minus(3);
        meinRechner.mal(9);
        meinRechner.geteilt(2);
        System.out.println("Ergebnis: " + meinRechner.getErgebnis());
    }
}