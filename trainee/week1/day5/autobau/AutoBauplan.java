package de.brightstraining.trainee.week1.day5.autobau;

public class AutoBauplan {
    // Attribute erstellen
    private Rad[]  raeder;       // -> Arrays aus der Klasse Rad
    private Tuer[] tueren;      // -> Arrays aus der Klasse Tuer
    private double gewicht;


    // Konstruktor
    public AutoBauplan(Rad[] raeder,Tuer[] tueren,double gewicht) {
        this.raeder = raeder;
        this.tueren = tueren;
        this.gewicht = gewicht;
    }

    // Methode
    public float getGesamtgewicht(float gewicht,float raeder,float tueren) {
        float gesamtgewicht = gewicht + raeder + tueren;
        return gesamtgewicht;
    }


    // Getter

    public Rad[] getRaeder( ) {
        return raeder;
    }

    public Tuer[] getTueren( ) {
        return tueren;
    }

    public double getGewicht( ) {
        return gewicht;
    }
}