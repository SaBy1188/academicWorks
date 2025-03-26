package de.brightstraining.prestudies.week1.datatypes;

import java.time.OffsetTime;
import java.time.temporal.ChronoField;
public class Datatypes {
    public static void main(String[] args) {
        /*Verschiedene Datentypen deklarieren:
          1. Deine Initialen = String
          2. Einwohnerzahl in Deutschland = int
          3. Einwohnerzahl auf der Erde = long
          4. Ist gerade Tag? = boolean
          5. Trefferquote von Mario Gomez (statistische Tore pro Spiel) bei Bayern München = float
          6. Dauer in Wochen des Javakurses = byte
          7. Die mathematische Zahl PI = double
         */

        System.out.println("Aufgabe 1: Verschiedene Datentypen\n");

        String userInitials = "SB";
        int einwohnerzahlDeutschland = 83240000;
        long einwohnerzahlErde = 8050000000L;
        float statistikMarioGomez = 0.65F;
        byte kursDauer = 16;
        double zahlPI = Math.PI;

        System.out.println("Meine Initialen: " + userInitials);
        System.out.println("Einwohnerzahl in Deutschland: " + einwohnerzahlDeutschland);
        System.out.println("Einwohnerzahl auf der Erde: " + einwohnerzahlErde);

        /*
        boolean istGeradeTag = true;
        if (true);
        System.out.println("Es ist gerade Tag.");
         */

        //Ergänzung zu boolean
        OffsetTime uhrzeit = OffsetTime.now();
        byte istGeradeTag = (byte) uhrzeit.get(ChronoField.HOUR_OF_DAY);
        if(istGeradeTag >= 7 && istGeradeTag <= 22){
            System.out.println("Ja, gerade ist Tag.");
        }
        else {
            System.out.println("Nein, gerade ist Nacht.");
        }

        System.out.println("Trefferquote von Mario Gomez pro Spiel: " + statistikMarioGomez);
        System.out.println("Dauer des Javakurses in Wochen: " + kursDauer);
        System.out.println("Die mathematische Zahl PI: " +zahlPI);
    }
}