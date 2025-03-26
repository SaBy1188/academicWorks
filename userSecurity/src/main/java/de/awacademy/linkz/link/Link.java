package de.awacademy.linkz.link;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // Zeigt an, dass Klasse als DB-Entität verwendet wird
public class Link {

    @Id // Attribut ist der Primärschlüssel
    @GeneratedValue // Attribut wird generiert (ohne Angabe = Standardsequenzgenerator)
    private long id;

    private String title;

    private String url;

    private int points;

    public Link() {
        // Default constructor for JPA
        // Leerer und öffentlicher Konstruktor wird für jede DB-Entität benötigt!
    }

    public Link(String title, String url) {
        this.title = title;
        this.url = url;
        this.points = 0;
    }

    public Link(String title, String url, int points) {
        this.title = title;
        this.url = url;
        this.points = points;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public int getPoints() {
        return points;
    }

    public void upvote() {
        this.points++;
    }

    public void downvote() {
        this.points--;
    }
}