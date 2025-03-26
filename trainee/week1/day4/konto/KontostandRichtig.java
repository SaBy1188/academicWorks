package de.brightstraining.trainee.week1.day4.konto;

public class KontostandRichtig {
    public static void main(String[] args) {
        new KontostandRichtig().run();
    }

    private void run() {

        // neues Objekt mit Inhalt 7
        Konto konto = new Konto(7);
        System.out.println("Konto vorher: " + konto);

        // Objekt wird hier abgelegt
        verdoppelInt(konto);
        System.out.println("Konto nachher: " + konto);
    }


    // Neue Klasse anlegen
    private void verdoppelInt(Konto konto) {
        int alterKontostand = konto.getKontostand();

        // Setter aufrufen statt Objekt anlegen
        // nun wird auf die selbe Referenz zugegriffen
        // Objekt kann somit überschrieben werden
        // konto = new Konto(2 * alterKontostand);
        konto.setKontostand(2 * alterKontostand);
    }
}