package de.brightstraining.prestudies.week2.operators.solution;

public class CodeLine {
    public static void main(String[] args) {

        double x = 15.5;
        double a = Math.sqrt(3.5 + x);
        double b = a * 5;
        double c = b / 3;
        double d = x + 10;
        double e = x - 4.1;
        double f = d * e;
        double g = c - f;

        System.out.println(g);

        // Zusammenführen der Zeilen zu einer.
        double h = ((Math.sqrt(3.5 + 15.5) * 5) / 3) - ((15.5 + 10) * (15.5 - 4.1));
        // hier ist weiteres vereinfachen möglich

        // Vergleich, ob das Ergebnis immer noch stimmt.
        boolean vergleich = g == h;
        System.out.println("Ergebnisse gleich? " + vergleich);

    }
}