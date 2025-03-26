package de.brightstraining.prestudies.week4;

public class Taschenrechner {

    // Eigenschaften
    // Instanzvariable liefert Ergebnis der mathematischen Operatoren
    private int ergebnis;


    // Konstruktor
    // Legt die initiale Zahl im Taschenrechner mit NULL fest
    public Taschenrechner() {
        this.ergebnis = 0;
    }

    // Methoden
    // Definiert die Operatoren
    public int plus(int value) {
        ergebnis = ergebnis + value;
        return ergebnis;
    }

    public int minus(int value) {
        ergebnis = ergebnis - value;
        return ergebnis;
    }

    public int mal(int value) {
        ergebnis = ergebnis * value;
        return ergebnis;
    }

    int geteilt(int value) {

        // Auf Null prüfen
        if(value != 0) {
            ergebnis = ergebnis / value;
        } else {
            System.out.println("ungültiger Wert");
        } return ergebnis;
    }

    // Getter
    // Liefert Ergebnis zurück an den Taschenrechner
    public int getErgebnis() {
        return ergebnis;
    }
}