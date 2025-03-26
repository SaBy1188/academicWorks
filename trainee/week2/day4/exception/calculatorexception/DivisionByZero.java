package de.brightstraining.trainee.week2.day4.exception.calculatorexception;

public class DivisionByZero {

    long ergebnis;

public long geteilt(long zahlB) throws DivisionByZeroException {
    if(zahlB != 0) {
        ergebnis = ergebnis / zahlB;
    } else {
        throw new DivisionByZeroException("Fehler",ergebnis);
    } return ergebnis;
}

public long plus(long zahlA) {
    ergebnis = ergebnis + zahlA;
    return ergebnis;
}

    public long getErgebnis( ) { return ergebnis; }
}