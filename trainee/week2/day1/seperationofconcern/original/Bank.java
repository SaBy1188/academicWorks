package de.brightstraining.trainee.week2.day1.seperationofconcern.original;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
public class Bank {
    public void schickeGeld(int betrag, String quellKonto, String zielKonto)
    throws IOException {
        String auditLog = "";
        // Die Überweisungskosten hängen vom Betrag ab:
        // Beträge bis 1000,00 €: 10 Cent
        // Beträge über 1000,00 €: 50 Cent
        int kosten = 10;
        if (betrag > 1000) {
            kosten = 50;
        }
        // Schreibe den Überweisungsbetrag und die Bankkonten in eine Datei.
        // So können wir später nachvollziehen, welche Beträge von wo nach
        // wo überwiesen wurden.
        auditLog = "Überweisung: " + "\r\n";
        Files.write(Paths.get("./auditlog.txt"), auditLog.getBytes(),
                    StandardOpenOption.CREATE);
        auditLog = "Buchung des Betrages von " + betrag + " € vom Konto " +
                quellKonto + " auf das Konto " + zielKonto + "\r\n ";
        Files.write(Paths.get("./auditlog.txt"), auditLog.getBytes(),
                    StandardOpenOption.APPEND);
        auditLog = "Kosten für die Überweisung: " + kosten + " Cent\r\n";
        Files.write(Paths.get("./auditlog.txt"), auditLog.getBytes(),
                    StandardOpenOption.APPEND);
        System.out.printf("Überweisungskosten: " + kosten);
        // Schreibe einen Beleg für die Buchung als Quittung in eine Datei.
        // So bekommen sowohl der Sender als auch der Empfänger des Geldes
        // eine Bestätigung ihrer Überweisung.
        String quittung = "Quittung für die Überweisung:\r\n" +
                "\r\nDate: " + LocalDateTime.now() +
                "\r\nAmount:" + betrag +
                "\r\nCost: " + kosten +
                "\r\nFrom account:" + quellKonto +
                "\r\nTo account:" + zielKonto + "\r\n";
        Files.write(Paths.get("./confirmation.txt"), quittung.getBytes(),
                    StandardOpenOption.CREATE);
        // Führe die Überweisung durch - irgendwie...

    }
}