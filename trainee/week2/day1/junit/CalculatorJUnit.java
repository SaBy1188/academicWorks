package de.brightstraining.trainee.week2.day1.junit;

public class CalculatorJUnit {
    private int ergebnis = 0;

    public int getErgebnis( ) {
        return ergebnis;
    }

    public void plus(int zahl) {
        this.ergebnis += zahl;
    }

    public void minus(int zahl) {
        this.ergebnis -= zahl;
    }

    public void mal(int zahl) {
        this.ergebnis *= zahl;
    }

    public void geteilt(int zahl) {
        this.ergebnis /= zahl;
    }
}