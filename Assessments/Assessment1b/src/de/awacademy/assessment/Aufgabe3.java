package de.awacademy.assessment;

import de.awacademy.shop.Country;
import de.awacademy.test.Test;

public class Aufgabe3 {

    public static void main(String[] args) {

        /*
            Aufgabe 3: Erstelle die Klasse Address, welche die Informationen zu
            einer Lieferadresse zusammenfasst.

            Folge den Schritten hier und entferne die // um deinen Code zu testen!

            (a) Die Klasse Address enthält die vier String-Eigenschaften name,
            company, line1 und line2 sowie eine Eigenschaft country vom Typ
            Country.

            Die Konstruktion eines Objekts muss ohne Parameter möglich sein.
            Hierbei werden alle String-Eigenschaften mit einem leeren String
            belegt und country mit UNKNOWN.

            Die Eigenschaften sind alle über Getter-Methoden lesbar.
         */
        Address a1 = new Address();
        Test.equals("", a1.getName());
        Test.equals("", a1.getCompany());
        Test.equals("", a1.getLine1());
        Test.equals("", a1.getLine2());
        Test.equals(Country.UNKNOWN, a1.getCountry());

        /*
            Die Eigenschaften sind alle über Setter-Methoden schreibbar.
         */
        a1.setName("Mira Musterfrau");
        Test.equals("Mira Musterfrau", a1.getName());
        a1.setCompany("Beispiel AG");
        Test.equals("Beispiel AG", a1.getCompany());
        a1.setLine1("Hauptstraße 4");
        Test.equals("Hauptstraße 4", a1.getLine1());
        a1.setLine2("0815 Neustadt");
        Test.equals("0815 Neustadt", a1.getLine2());
        a1.setCountry(Country.GERMANY);
        Test.equals(Country.GERMANY, a1.getCountry());



        /*
            (b) Füge der Klasse die Methode isValid hinzu, welche keine Parameter
            erwartet und einen boolean Wert zurückgibt.

            Der Rückgabewert muss true sein, wenn alle folgenden Bedingungen
            erfüllt sind, sonst false:

            - Die Eigenschaften name, line1 und line2 sind nicht leer
            - Die Eigenschaft country ist nicht UNKNOWN oder null

            Es kann außerdem angenommen werden, dass keine der String-Eigenschaften
            null ist.
         */

        Address a2 = new Address();
        Test.equals(false, a2.isValid());

        a2.setName("Bert Beispiel");
        a2.setLine1("Nebenstr. 20");
        a2.setLine2("2021 Altdorf");

        Test.equals(false, a2.isValid());

        a2.setCountry(null);
        Test.equals(false, a2.isValid());

        a2.setCountry(Country.SWITZERLAND);
        Test.equals(true, a2.isValid());

        /*
            (c) Überschreibe die Methode toString in der Klasse. Es muss
            ein String zurückgegeben werden, welcher die Eigenschaften
            name, company, line1, line2 und country getrennt durch Zeilen-
            umbrüche enthält.

            Für country kann die automatische Konvertierung von Enum-Objekten
            zu String verwendet werden.

            Falls die Eigenschaft company leer ist, darf keine leere Zeile
            entstehen.

            Am Ende des Strings darf kein weiterer Zeilenumbruch stehen.
         */
        Test.equals(
                "Mira Musterfrau\nBeispiel AG\nHauptstraße 4\n0815 Neustadt\nGERMANY",
                a1.toString()
        );
        Test.equals(
                "Bert Beispiel\nNebenstr. 20\n2021 Altdorf\nSWITZERLAND",
                a2.toString()
        );
    }
}
