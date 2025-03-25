package de.awacademy.assessment;

import de.awacademy.shop.Country;

public class Address {
    // TODO: 13.03.2023 Attribute erstellen
    private String name;
    private String company;
    private String line1;
    private String line2;
    private Country country;

    // TODO: 13.03.2023 Konstruktor; leere Strings, Country UNKNOWN 
    public Address() {
        this.name = "";
        this.company = "";
        this.line1 = "";
        this.line2 = "";
        this.country = Country.UNKNOWN;
    }

    // TODO: 13.03.2023 Getter Methoden
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

    public Country getCountry() {
        return country;
    }

    // TODO: 13.03.2023 Setter Methoden

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

    public void setCountry(Country country) {
        this.country = country;
    }

    // TODO: 13.03.2023 isValid Methode
    public boolean isValid() {
        if (name == null || company == null || line1 == null || line2 == null || country == null) {
            return false;
        }

        if (name.isEmpty() || line1.isEmpty() || line2.isEmpty()) {
            return false;
        }

        if (country == Country.UNKNOWN) {
            return false;
        }

        return true;
    }

    // TODO: 13.03.2023 toString anpassen

    @Override
    public String toString() {
        return name + '\n'
                // falls company leer, kein Zeilenumbruch oder Leerzeile
                + (company.isEmpty() ? "" : company + '\n')
                + line1 + '\n'
                + line2 + '\n'
                // country Umwandlung in String
                + (country.toString())
                // kein Zeilenumbruch am Ende
                ;
    }
}
