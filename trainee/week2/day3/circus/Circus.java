package de.brightstraining.trainee.week2.day3.circus;

public class Circus {
    public static void main(String[] args) {

        Animal[] animals = new Animal[] {
                new Elephant("Emiel"),
                new Lion("Laura")
        };

        Person[] persons = new Person[] {
                new FireEater("Fiona die Furchtlose"),
                new Clown("Karl der Komische")
        };

        for (Animal animal : animals) {
            System.out.println("Nächster Programmpunkt: " + animal.getName());
            animal.showAnimal();
        }

        for (Person person : persons) {
            System.out.println("Nächster Programmpunkt: " + person.getName());
            person.showPerson();
        }
    }
}