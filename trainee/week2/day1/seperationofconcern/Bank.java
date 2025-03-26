package de.brightstraining.trainee.week2.day1.seperationofconcern;

//Arbeitsschritte:
//        1. Lagere die Berechnung für die Überweisungskosten in eine eigene private Methode
//        innerhalb der Klasse Bank aus.
//        2. Lagere den Code, der die sog. Audit-Logs in die Datei auditlog.txt schreibt, in
//        eine eigene Klasse AuditLogger aus.
//        3. Lagere den Code, der die Quittung in die Datei bestaetigung.txt schreibt, in
//        eine eigene Klasse Quittung aus.



// Schritt 12: Ungenutzte Imports entfernen mit "markieren" -> Code -> Optimize Imports
import java.io.IOException;



/*Arbeitsschritte:
        1. Lagere die Berechnung für die Überweisungskosten in eine eigene private Methode
        innerhalb der Klasse Bank aus.
        2. Lagere den Code, der die sog. Audit-Logs in die Datei auditlog.txt schreibt, in
        eine eigene Klasse AuditLogger aus.
        3. Lagere den Code, der die Quittung in die Datei bestaetigung.txt schreibt, in
        eine eigene Klasse Quittung aus.*/

public class Bank {
    // Schritt 1: Main Methode anlegen und neues Bankobjekt erstellen
    // "schickeGeld" wirft Exception, hier muss vorerst die Exception weitergeworfen werden (s. Confluence Exception)
    public static void main(String[] args) throws IOException {
        new Bank().schickeGeld(100,"Sabrin", "Patrick");
    }




    // Schritt 4: Auskommentieren
    public void schickeGeld(int betrag,String quellKonto,String zielKonto) throws IOException {

        String auditLog = "";

        // Schritt 5: Methode innerhalb übergeordneter Methode aufrufen
        int kosten = berechneUeberweisungskosten(betrag);

        /* Methode extrahieren über markieren -> RK -> Refactor -> Extract Method
        // Die Überweisungskosten hängen vom Betrag ab:
        // Beträge bis 1000,00 €: 10 Cent
        // Beträge über 1000,00 €: 50 Cent
        int kosten = 10;
        if(betrag > 1000) {
            kosten = 50;
        }
        */



        /*Schritt 6: Klasse AuditLogger anlegen -> (s. Klasse)
        Was geht als Parameter rein? (betrag, quellKonto, zielKonto, kosten)
        Welchen Rückgabewert habe ich? (keinen = void, hier wird die Datei direkt in eine txt. geschrieben)*/

        /* Methode extrahieren; auskommentieren
        // Schreibe den Überweisungsbetrag und die Bankkonten in eine Datei.
        // So können wir später nachvollziehen, welche Beträge von wo nach
        // wo überwiesen wurden.
        auditLog = "Überweisung: " + "\r\n";
        Files.write(Paths.get("./auditlog.txt"),auditLog.getBytes( ),StandardOpenOption.CREATE);
        auditLog = "Buchung des Betrages von " + betrag + " € vom Konto " + quellKonto + " auf das Konto " + zielKonto + "\r\n ";
        Files.write(Paths.get("./auditlog.txt"),auditLog.getBytes( ),StandardOpenOption.APPEND);
        auditLog = "Kosten für die Überweisung: " + kosten + " Cent\r\n";
        Files.write(Paths.get("./auditlog.txt"),auditLog.getBytes( ),StandardOpenOption.APPEND);
        System.out.printf("Überweisungskosten: " + kosten);
        */


        // Schritt 7: Methode aufrufen
        // Schritt 8: neue Instanz mit "new.AuditLogger()." erstellen
        // da die Methode ausgelagert wurde und sonst nicht zugegriffen werden kann
        new AuditLogger().writeAuditLog(betrag,quellKonto,zielKonto,kosten);




        // Schritt 9: Selbes Spiel mit dieser Methode (extrahiere, in eigene Klasse einfügen, Methode aufrufen)
        // Welche Parameter gehen rein? (betrag, kosten, quellKonto, zielKonto)
        // Welchen Rückgabewert habe ich? (void, da nur .txt geschrieben wird)

        /*
        Schreibe einen Beleg für die Buchung als Quittung in eine Datei.
        // So bekommen sowohl der Sender als auch der Empfänger des Geldes
        // eine Bestätigung ihrer Überweisung.
        String quittung = "Quittung für die Überweisung:\r\n" + "\r\nDate: " + LocalDateTime.now( ) + "\r\nAmount:" + betrag + "\r\nCost: " + kosten + "\r\nFrom account:" + quellKonto + "\r\nTo account:" + zielKonto + "\r\n";
        Files.write(Paths.get("./confirmation.txt"),quittung.getBytes( ),StandardOpenOption.CREATE);
        */



        // Schritt 11: Auch hier wieder eine Instanz setzen
        new Quittung().getUeberweisungskosten(betrag,quellKonto,zielKonto,kosten);


        // Führe die Überweisung durch - irgendwie...
    }




    // Schritt 2: Welche Parameter benötige ich? Und welche werden zurückgeworfen?
    // int betrag soll in die Methode eingehen, int kosten werden als return zurückgeworfen
    // Methode soll private werden und muss int als Datentyp vorweisen

    private int berechneUeberweisungskosten (int betrag) {
        // Die Überweisungskosten hängen vom Betrag ab:
        // Beträge bis 1000,00 €: 10 Cent
        // Beträge über 1000,00 €: 50 Cent
        int kosten = 10;
        if(betrag > 1000) {
            kosten = 50;
        }

        // Schritt 3: Rückgabewert einfügen
        return kosten;
    }
}