package de.brightstraining.prestudies.week2.operators.metropole;

public class Metropolen {

    private
    String name;
    private boolean istHauptstadt;
    private int anzahlEinwohner;
    private double steuerEinnahmenProEinwohner;

        // Stadt = Metropole -> prüfen
        // Eigenschaften (Attribute) erstellen

        // > ; >=

/*      Regeln: Eine Stadt ist eine Metropole, wenn sie eine Hauptstadt ist und zudem mehr als
        100.000 Einwohner hat. Oder wenn sie mehr als 200.000 Einwohner hat und ein jährliches
        Steuereinkommen von mindestens 1.000.000.000 Euro hat.*/


    // Methode
    public boolean istMetropole() {

    //    return istHauptstadt == true && anzahlEinwohner > 100_000
    //            || anzahlEinwohner > 200_000 && steuerEinnahmenProEinwohner >= 1_000_000_000;

        if(istHauptstadt == true && anzahlEinwohner > 100_000
        || anzahlEinwohner > 200_000 && steuerEinnahmenProEinwohner >= 1_000_000_000) {
            return true;
        } else {
            return false;
        }
    }


    // Konstruktor
    public Metropolen(String name,boolean istHauptstadt,int anzahlEinwohner,double steuerEinnahmenProEinwohner) {
        this.name = name;
        this.istHauptstadt = istHauptstadt;
        this.anzahlEinwohner = anzahlEinwohner;
        this.steuerEinnahmenProEinwohner = steuerEinnahmenProEinwohner;
    }

    // Hier brauche ich keine Getter & Setter
}