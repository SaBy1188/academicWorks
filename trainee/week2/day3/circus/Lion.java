package de.brightstraining.trainee.week2.day3.circus;

public class Lion extends Animal {

    public Lion(String name) {
        super(name);
    }

    public void showAnimal() {
        protectArena();
        System.out.println("Roaaar!");
        unprotectArena();
    }

    private void protectArena() {
        System.out.println("Manege gesichert.");
    }

    private void unprotectArena() {
        System.out.println("Manegen-Sicherung abgebaut.");
    }
}