package de.brightstraining.prestudies.week2.operators;
import java.util.Scanner;
public class TimeUnit {
    public static void main(String[] args) {

        // Scanfunktion zur Abfrage der Sekunden
        Scanner scanSeconds = new Scanner(System.in);

        System.out.println("How many seconds do you want to convert?");
        int enterSeconds = scanSeconds.nextInt();

        // Umrechnung der Eingabe zu Stunden, Minuten und Sekunden
        int years = enterSeconds / 31536000;
        int days = (enterSeconds % 31536000) / 86400;
        int hours = ((enterSeconds % 31536000) % 86400) / 3600;
        int minutes = (((enterSeconds % 31536000) % 86400) % 3600) / 60;
        int seconds = (((enterSeconds % 31536000) % 86400) % 3600) % 60;

        System.out.println("You entered " + enterSeconds + " seconds.\n"
                + "This is the equivalent of "
                + years + " years, "
                + days + " days, "
                + hours + " hours, "
                + minutes + " minutes and "
                + seconds + " seconds.");
    }
}