package de.brightstraining.trainee.week2.day3.circus;

public class Animal {

    private String name;


    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void showAnimal() {
        System.out.println("Muss von jedem Tier individuell implementiert werden!");
    }
}