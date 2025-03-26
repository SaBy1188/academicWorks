package de.brightstraining.trainee.week1.day5.quiz;

public class Dampfschifffahrt {
    // Aufgabe: Zahlen von 1 bis einschließlich 100 Zeilen ausgeben
    // Benötige: for Schleife; x = 1; x <= 100; x++
    // Regeln
    // Zahl durch 2 und 3 teilbar, nicht durch 5 = "DampfSchiff"
    // Zahl durch 3 und 5 teilbar, nicht durch 2 = "SchiffFahrt"
    // Zahl durch 2. 3 und 5 teilbar = "DampfSchiffFahrt"
    // Andernfalls Zahl ausgeben

    public static void main(String[] args) {
        dampfSchiffFahrt(100);
    }
    public static int dampfSchiffFahrt(int valueMax) {

        System.out.println("Das Schiff hat abgelegt.");

        // FOR Schleife erstellen
        for (int x = 1; x <= valueMax; x++) {
            if ((x % 2 == 0) && (x % 3 == 0) && !(x % 5 == 0)) {
                System.out.println("DampfSchiff");
            } else if ((x % 3 == 0) && (x % 5 == 0) && !(x % 2 == 0)) {
                System.out.println("SchiffFahrt");
            } else if ((x % 2 == 0) && (x % 3 == 0) && (x % 5 == 0)) {
                System.out.println("DampfSchiffFahrt");
            } else {
                System.out.println(x);
            }
        }
        System.out.println("Das Schiff ist im Hafen angekommen.");

        return valueMax;
    }
}