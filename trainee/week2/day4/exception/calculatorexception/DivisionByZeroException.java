package de.brightstraining.trainee.week2.day4.exception.calculatorexception;

public class DivisionByZeroException extends Exception {
    long zahl;

    public DivisionByZeroException(String message,long zahl) {
        super(message);
        this.zahl = zahl;
    }

    public long getZahl() { return zahl; }

    @Override public String toString( ) {
        return "DivisionByZeroException{" + "zahl=" + zahl + '}';
    }
}