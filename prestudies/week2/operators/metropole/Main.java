package de.brightstraining.prestudies.week2.operators.metropole;

public class Main {
    public static void main(String[] args) {
        Metropolen stadt1 = new Metropolen("München",
                                           true,
                                           1200000,
                                           1000);
        Metropolen stadt2 = new Metropolen("Bielefeld",
                                           false,
                                           210_000,
                                           3000);


        boolean istMetropole1 = stadt1.istMetropole();
        System.out.println(istMetropole1);

        boolean istMetropole2 = stadt2.istMetropole();
        System.out.println(istMetropole2);
    }
    // Die Aufgabe verlangt keine Nutzereingabe
}