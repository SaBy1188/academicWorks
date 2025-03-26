package de.brightstraining.trainee.week1.day4.konto;

public class KontostandFalsch {
    public static void main(String[] args) {
        new KontostandFalsch( ).run( );
    }

    private void run( ) {

        // neues Objekt mit Inhalt 7
        Konto konto = new Konto(7);
        System.out.println("Konto vorher: " + konto);

        // Objekt wird hier abgelegt
        verdoppelInt(konto);
        System.out.println("Konto nachher: " + konto);
    }


    // Neue Klasse anlegen
    private void verdoppelInt(Konto konto) {
        int alterKontostand = konto.getKontostand( );

        // neues Objekt anlegen und Inhalt verdoppeln
        konto = new Konto(2 * alterKontostand);
    }

    // ACHTUNG:
    // Zeile 21: Neues Objekt mit neuer Referenznummer wird angelegt
    // Zeile 11: Objekt konto wird hier nicht überschrieben
}