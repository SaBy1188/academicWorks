package de.brightstraining.trainee.week2.day3.circus;

public class Person {

    private String name;


    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void showPerson() {
        System.out.println("Muss von jeder Person individuell implementiert werden!");
    }
}