package de.brightstraining.trainee.week2.day2.interfaces.geometrischefiguren;

public class Rechteck implements GeometrischeFigur {

    private double seiteA;

    private double seiteB;


    public Rechteck(double seiteA, double seiteB) {
        this.seiteA = seiteA;
        this.seiteB = seiteB;
    }

    @Override
    public void zeichne() {
        System.out.println("Ich bin ein Rechteck mit den Seitenlängen "
                + seiteA + " und " + seiteB);
    }

    @Override
    public double flaeche() {
        return seiteA * seiteB;
    }
}