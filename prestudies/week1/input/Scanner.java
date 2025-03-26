package de.brightstraining.prestudies.week1.input;
public class Scanner {
    public static void main(String[] args) {

        // https://codestarter.ch/java/3-konsoleneingabe

        System.out.println("Aufgabe 1: Text abfragen und ausgeben");

        String welcome = "\nHello Dear, please tell me your name:";
        System.out.println(welcome);

        java.util.Scanner sc;
        sc = new java.util.Scanner(System.in);

        String eingabe = sc.next();

        String welcomeJava = "you're now part of the great Java Course, ";

        System.out.println("Welcome! " + welcomeJava + eingabe + ".");
    }
}