package de.brightstraining.trainee.week2.day2.interfaces.geometrischefiguren;

public class Grafikprogramm {

    private GeometrischeFigur[] geometrischeFiguren;


    public Grafikprogramm(GeometrischeFigur[] geometrischeFiguren) {
        this.geometrischeFiguren = geometrischeFiguren;
    }

    public void zeichneAlle() {
        double gesamtFlaeche = 0;
        for (GeometrischeFigur geometrischeFigur : geometrischeFiguren) {
            geometrischeFigur.zeichne();
            gesamtFlaeche += geometrischeFigur.flaeche();
        }
        System.out.println("Die Gesamtfläche beträgt " + gesamtFlaeche);
    }
}