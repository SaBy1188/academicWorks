package de.brightstraining.trainee.week2.day1.seperationofconcern;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class AuditLogger {

    // Schritt 8: Methode in Klasse einfügen
    // Methode muss public sein
    public static void writeAuditLog(int betrag,String quellKonto,String zielKonto,int kosten) throws IOException {
        String auditLog;
        // Schreibe den Überweisungsbetrag und die Bankkonten in eine Datei.
        // So können wir später nachvollziehen, welche Beträge von wo nach
        // wo überwiesen wurden.
        auditLog = "Überweisung: " + "\r\n";
        Files.write(Paths.get("./auditlog.txt"),auditLog.getBytes( ),
                    StandardOpenOption.CREATE);
        auditLog = "Buchung des Betrages von " + betrag + " € vom Konto " + quellKonto + " auf das Konto " + zielKonto + "\r\n ";
        Files.write(Paths.get("./auditlog.txt"), auditLog.getBytes(),
                    StandardOpenOption.APPEND);
        auditLog = "Kosten für die Überweisung: " + kosten + " Cent\r\n";
        Files.write(Paths.get("./auditlog.txt"), auditLog.getBytes(),
                    StandardOpenOption.APPEND);
        System.out.printf("Überweisungskosten: " + kosten);
    }
}