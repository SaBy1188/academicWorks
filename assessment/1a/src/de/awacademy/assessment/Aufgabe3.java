package de.awacademy.assessment;

import de.awacademy.test.Test;

public class Aufgabe3 {

    public static void main(String[] args) {

        Address a1 = new Address();
        Test.equals("", a1.getName());
        Test.equals("", a1.getCompany());
        Test.equals("", a1.getLine1());
        Test.equals("", a1.getLine2());
        Test.equals("", a1.getCountry());

        a1.setName("Mira Musterfrau");
        Test.equals("Mira Musterfrau", a1.getName());
        a1.setCompany("Beispiel AG");
        Test.equals("Beispiel AG", a1.getCompany());
        a1.setLine1("Hauptstraße 4");
        Test.equals("Hauptstraße 4", a1.getLine1());
        a1.setLine2("0815 Neustadt");
        Test.equals("0815 Neustadt", a1.getLine2());

        a1.setCountry("Germany");
        Test.equals("GERMANY", a1.getCountry());

        String[] countries = {"GERMANY", "AUSTRIA", "SWITZERLAND"};

        Address a2 = new Address();
        Test.equals(false, a2.isValid(countries));

        a2.setName("Bert Beispiel");
        a2.setLine1("Nebenstr. 20");
        a2.setLine2("2021 Altdorf");

        Test.equals(false, a2.isValid(countries));
        a2.setCountry(new String("Austria"));

        Test.equals(true, a2.isValid(countries));
        Test.equals(false, a2.isValid(new String[]{"BELGIUM"}));

        Test.equals(
                "Mira Musterfrau\nBeispiel AG\nHauptstraße 4\n0815 Neustadt\nGERMANY",
                a1.toString()
        );
        Test.equals(
                "Bert Beispiel\nNebenstr. 20\n2021 Altdorf\nAUSTRIA",
                a2.toString()
        );
    }
}