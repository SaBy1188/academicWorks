package de.exercises.operatoren.bonus;

public class BonusPiBerechnung {
    public static double piBerechnen(int n) {
        double piHalbe = 1.0;
        double j = 1.0;

        // Pi / 2 = (2/1) * (2/3) * (4/3) * (4/5) * (6/5) * (6/7) * ..
        for (double i = 1; i < n; i++, j++) {
            if (i % 2 == 0) {
                piHalbe *= (j / (j + 1));
            } else {
                piHalbe *= ((j + 1) / j);
            }
        }
        return 2.0 * piHalbe;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Eigene Berechnung: " + BonusPiBerechnung.piBerechnen(i));
        }
        System.out.println("Java Math.PI: " + Math.PI);
    }
}
