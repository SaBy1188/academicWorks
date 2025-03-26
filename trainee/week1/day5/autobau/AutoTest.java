package de.brightstraining.trainee.week1.day5.autobau;

public class AutoTest {
    public static void main(String[] args) {

        // Auto erstellen
        AutoBauplan autoVW = new AutoBauplan( new Rad[4],new Tuer[4],2000 );
        System.out.println("Gesamtgewicht: " + autoVW.getGesamtgewicht(2000,100,100) + "kg");
    }
}