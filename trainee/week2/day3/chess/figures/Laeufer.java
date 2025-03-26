package de.brightstraining.trainee.week2.day3.chess.figures;

import de.brights.tasks.traineeprogram.week2.day3.vererbung.chess.ChessPiece;

public class Laeufer extends ChessPiece {

    public Laeufer(boolean white,int x,int y) {
        // Konstruktor: Erbt Attribute
        super(white,x,y);
    }

    @Override
    public boolean canMove(int toX,int toY) {
        int deltaX = Math.abs(toX - getX( ));    // neue Position berechnen
        int deltaY = Math.abs(toY - getY( ));

        // TODO: Sind toX und toY noch gültige Koordinaten auf unserem Schachbrett?
        // Die Züge dürfen nicht außerhalb von 0 - 7 sein
        boolean ungueltigX = (toX < 0 || toX > 7);
        boolean ungueltigY = (toY < 0 || toY > 7);

        if(ungueltigX == true || ungueltigY == true) {
            System.out.println("invalide move");
        }

        // TODO: Ist die Figur überhaupt bewegt worden? Stehenbleiben ist kein gültiger Zug
        // Bedingung: Es muss einer der Koordinaten = 1 sein
        else if(!(deltaX == 0 && deltaY == 0)) {

        }
        // TODO: Prüfen, ob deltaX und deltaY für diese Figur eine gültige Bewegung ist
        // Bedingungen (diagonal frei)
        // deltaX == deltaY
        else if(deltaX == deltaY) {
            return true;
        } return false;
    }

    // Abstrakte Methode aufrufen
    @Override public String getName( ) {
        return "Läufer";
    }
}