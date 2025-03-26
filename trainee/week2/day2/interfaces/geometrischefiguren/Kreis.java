package de.brightstraining.trainee.week2.day2.interfaces.geometrischefiguren;

public class Kreis implements GeometrischeFigur {

    private double radius;


    public Kreis(double radius) {
        this.radius = radius;
    }

    @Override
    public void zeichne() {
        System.out.println("Ich bin ein Kreis mit dem Radius " + radius);
    }

    @Override
    public double flaeche() {
        return Math.PI * radius * radius;
    }
}