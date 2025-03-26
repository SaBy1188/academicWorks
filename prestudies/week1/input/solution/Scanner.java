package de.brightstraining.prestudies.week1.input.solution;

public class Scanner {
    public static void main(String[] args) {

        System.out.println("Bitte gib deinen Namen ein: ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        String name = scanner.nextLine();

        System.out.println("Hallo " + name + ", herzlich Willkommen im Javakurs");
    }
}