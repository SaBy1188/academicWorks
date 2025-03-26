package de.brightstraining.trainee.week1.day4;

public class Kunde {
    // Kunden Klasse erstellen mit folgenden Feldern:
    private String id;
    private String name;
    private String adresse;
    private String postleitzahl;
    private String stadt;
    private String email;

    // Dann definiere einen Konstruktor
    public Kunde(String id, String name, String adresse, String postleitzahl, String stadt, String email) {
        // mit Standardwerten
        this.id = "abcde";
        this.name = "max mustermann";
        this.adresse = "strasse 1";
        this.postleitzahl = "76543";
        this.stadt = "stadt";
        this.email = "email@mail.com";
    }

    // Getter und Setter für Attribute
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getPostleitzahl() {
        return postleitzahl;
    }

    public String getStadt() {
        return stadt;
    }

    public String getEmail() {
        return email;
    }
}