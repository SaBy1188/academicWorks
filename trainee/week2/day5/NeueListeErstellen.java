package de.brightstraining.trainee.week2.day5;

import java.util.ArrayList;

public class NeueListeErstellen {
    // Methode zur Erstellung einer neuen ArrayListe für ganze Zahlen

    public static ArrayList<Integer> geradeZahlenNeueListe(ArrayList<Integer> zahlen) {
        ArrayList<Integer> geradeZahlenNeueListe = new ArrayList<Integer>();
        for(int zahl : zahlen) {
            if(zahl % 2 == 0) {
                geradeZahlenNeueListe.add(zahl);
            }
        } return geradeZahlenNeueListe;
    }

    public static void main(String[] args) {
        ArrayList<Integer> zahlen = new ArrayList<>();
        zahlen.add(132);
        zahlen.add(-283);
        zahlen.add(748);
        zahlen.add(10_883);
        zahlen.add(849);
        zahlen.add(732);

        System.out.println("Gefilterte Liste: " + geradeZahlenNeueListe(zahlen));
    }
}