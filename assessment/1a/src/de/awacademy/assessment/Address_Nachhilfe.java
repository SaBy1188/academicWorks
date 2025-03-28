package de.awacademy.assessment;

import java.util.Arrays;

public class Address_Nachhilfe {        // Achtung Name schlägt fehl!
    private String name;
    private String company;
    private String line1;
    private String line2;
    private String country;

    // Konstruktor
    public Address_Nachhilfe() {
        this.name = "";
        this.company = "";
        this.line1 = "";
        this.line2 = "";
        this.country = "";
    }

    // Getter
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

    public String getCountry() {
        return country.toUpperCase( );
    }

    // Setter
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
        this.country = country;
    }

    // Methode isValid
    String[] countries = new String[3];

    public boolean isValid(String[] countries) {

        if(name == null || line1 == null || line2 == null || country == null || company == null) {
            return false;
        }

        // Achtung: company DARF leer sein, aber nicht null
        if (name.isEmpty() || line1.isEmpty() || line2.isEmpty() || country.isEmpty()) {
            return false;
        }

        // Arrays.asList wird benötigt, da diese Methoden nur auf Collections nicht auf Arrays anwendbar sind
        // prüfen, ob country in UpperCase geschrieben wurden
        if(!Arrays.asList(countries).contains(country.toUpperCase())) {
            return false;
        }

        return true;
    }

    @Override public String toString( ) {
        return name + '\n'
                + (company.isEmpty() ? "" : company + "\n")     // Feld: company darf leer sein; "" falls leer, ansonsten company
                + line1 + '\n'
                + line2 + '\n'
                + country.toUpperCase();                        // Ausgabe in Großbuchstaben
    }
}