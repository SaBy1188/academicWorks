package de.brightstraining.trainee.week2.day2.interfaces.geometrischefiguren;

public class Main {

    public static void main(String[] args) {
        GeometrischeFigur[] geometrischeFiguren = new GeometrischeFigur[] {
                new Rechteck(2, 5),
                new Rechteck( 3, 4),
                new Kreis(7),
                new DreieckRechtwinklig(2, 4),
                new Kreis(15)
        };
        new Grafikprogramm(geometrischeFiguren).zeichneAlle();
    }
}