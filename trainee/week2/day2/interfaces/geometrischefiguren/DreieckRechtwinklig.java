package de.brightstraining.trainee.week2.day2.interfaces.geometrischefiguren;

public class DreieckRechtwinklig implements GeometrischeFigur {

    private double kathete1;

    private double kathete2;


    public DreieckRechtwinklig(double kathete1, double kathete2) {
        this.kathete1 = kathete1;
        this.kathete2 = kathete2;
    }

    @Override
    public void zeichne() {
        System.out.println("Ich bin ein rechtwinkliges Dreieck mit den Katheten "
                + kathete1 + " und " + kathete2);
    }

    @Override
    public double flaeche() {
        return (kathete1 * kathete2) / 2;
    }
}