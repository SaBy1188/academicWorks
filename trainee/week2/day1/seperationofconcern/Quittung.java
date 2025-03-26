package de.brightstraining.trainee.week2.day1.seperationofconcern;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;

public class Quittung {


    // Schritt 10: Methode in public ändern
    public static void getUeberweisungskosten(int betrag,String quellKonto,String zielKonto,int kosten) throws IOException {
        // Schreibe einen Beleg für die Buchung als Quittung in eine Datei.
        // So bekommen sowohl der Sender als auch der Empfänger des Geldes
        // eine Bestätigung ihrer Überweisung.
        String quittung = "Quittung für die Überweisung:\r\n" + "\r\nDate: " + LocalDateTime.now( ) + "\r\nAmount:" + betrag + "\r\nCost: " + kosten + "\r\nFrom account:" + quellKonto + "\r\nTo account:" + zielKonto + "\r\n";
        Files.write(Paths.get("./confirmation.txt"),quittung.getBytes( ),StandardOpenOption.CREATE);
    }
}