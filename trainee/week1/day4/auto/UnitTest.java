package de.brightstraining.trainee.week1.day4.auto;

public class UnitTest {
    public static void main(String[] args) {

        // Erstelle ein Auto Objekt
        Auto auto1 = new Auto("schwarz", 60, "Sabrin");


        // zu Konstruktor 1
        System.out.println(auto1);


        // zu Konstruktor 2
        Auto auto2 = new Auto("grün",100,"Lisa");
        System.out.println(auto2);

        // zu Konstruktor 3
        Auto auto3 = new Auto("Patrick");
        System.out.println(auto3);
    }
}