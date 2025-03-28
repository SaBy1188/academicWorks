package de.awacademy.assessment;

import java.util.Arrays;

public class Address {
    // TODO: 07.03.2023 Aufgabe 3a
        /*
            Aufgabe 3: Erstelle die Klasse Address, welche die Informationen zu
            einer Lieferadresse zusammenfasst.

            Folge den Schritten hier und entferne die // um deinen Code zu testen!

            (a) Die Klasse Address enthält die fünf String-Eigenschaften name,
            company, line1, line2 und country.

            Die Konstruktion eines Objekts muss ohne Parameter möglich sein.
            Hierbei werden alle Eigenschaften mit einem leeren String belegt.

            Die Eigenschaften sind alle über Getter-Methoden lesbar.

            Die Eigenschaften sind alle über Setter-Methoden schreibbar.

            Die Eigenschaft country wird in Großbuchstaben umgewandelt.
         */

    // TODO: 07.03.2023 Klasse Address erstellen
    // TODO: 07.03.2023 5 String Eigenschaften
    private String name;
    private String company;
    private String line1;
    private String line2;
    private String country;

    // TODO: 07.03.2023 Konstruktor ohne Parameter, leere String initialisieren
    public Address() {
        this.name = "";
        this.company = "";
        this.line1 = "";
        this.line2 = "";
        this.country = "";
    }

    // TODO: 07.03.2023 Methode über Getter abrufbar
    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public String getLine1() {
        return line1;
    }

    public String getLine2() {
        return line2;
    }

    // TODO: 07.03.2023 Country in Großbuchstaben ausgeben
    public String getCountry() {
        return country;
    }


    // TODO: 07.03.2023 Aufgabe 3b
        /*
            (b) Füge der Klasse die Methode isValid hinzu, welche einen Array von
            Ländernamen (Strings) als Parameter erhält und einen Boolean zurück
            gibt.

            Der Rückgabewert muss true sein, wenn alle folgenden Bedingungen
            erfüllt sind, sonst false:

            - Die Eigenschaften name, line1 und line2 sind nicht leer
            - Die Eigenschaft country ist gleich mit einem der Strings im über-
                gegebenen Array. Hierbei kann angenommen werden, dass dieser Array
                nur Einträge in Großbuchstaben enthält.

            Es kann außerdem angenommen werden, dass keine der Eigenschaften
            oder Einträge im Array null ist.
        */

    // TODO: 07.03.2023 Methoden über Setter überschreibbar
    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public void setCountry(String country) {
        this.country = country.toUpperCase();
    }

    // TODO: 07.03.2023 Methode implementieren
    public boolean isValid(String[] countries) {


        if (name == null || line1 == null || line2 == null || country == null || company == null) {
            return false;
        }

        if (name.isEmpty() || line1.isEmpty() || line2.isEmpty()) {
            return false;
        }

        if (!Arrays.asList(countries).contains(country.toUpperCase())) {
            return false;
        }

        // Alternative
        for (String land : countries) {
            if (countries.equals(country.toUpperCase())) {
                return true;
            }
        }

        return true;
    }

    // TODO: 07.03.2023 Aufgabe 3c
        /*
            (c) Überschreibe die Methode toString in der Klasse. Es muss
            ein String zurückgegeben werden, welcher die Eigenschaften
            name, company, line1, line2 und country getrennt durch Zeilen-
            umbrüche enthält.

            Falls die Eigenschaft company leer ist, darf keine leere Zeile
            entstehen.

            Am Ende des Strings darf kein weiterer Zeilenumbruch stehen.
        */

    // TODO: 07.03.2023 toString überschreiben
    // toString ist lediglich eine Methode aus Objects mit vordefinierten Ausdrücken
    @Override
    public String toString() {
        return name + '\n'
                + (company.isEmpty() ? "" : company + "\n")
                + line1 + '\n'
                + line2 + '\n'
                + country.toUpperCase();
    }

    /*
    // Alternative von Torsten
            @Override
            public String toString() {
                String result = name + "\n";
                if ((!company.isEmpty())) {
                    return name + "\n" +
                            company + "\n" +
                            line1 + "\n" +
                            line2 + "\n" +
                            country;
                }

                return name + "\n" +
                        line1 + "\n" +
                        line2 + "\n" +
                        country;
            }

    // Alternative mit IF Anweisung
            @Override
            public String toString() {
                if (!company.isEmpty()) {
                    return name + "\n" +
                            company + "\n" +
                            line1 + "\n" +
                            line2 + "\n" +
                            country;
                }

                return name + "\n" +
                        line1 + "\n" +
                        line2 + "\n" +
                        country;
            }

    // Original
    @Override
    public String toString() {
        return "Address{" +
                "countries=" + Arrays.toString(countries) +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", line1='" + line1 + '\'' +
                ", line2='" + line2 + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
    */
}