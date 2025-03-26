package de.brightstraining.trainee.week2.day3.chess.figures;

import de.brights.tasks.traineeprogram.week2.day3.vererbung.chess.ChessPiece;

public class Springer extends ChessPiece {

    public Springer(boolean white,int x,int y) {
        // Konstruktor: Erbt Attribute
        super(white,x,y);
    }

    @Override
    public boolean canMove(int toX,int toY) {
        int deltaX = Math.abs(toX - getX( ));    // neue Position berechnen
        int deltaY = Math.abs(toY - getY( ));

        // TODO: Sind toX und toY noch gültige Koordinaten auf unserem Schachbrett?
        // Die Züge dürfen nicht außerhalb von 0 - 7 sein
        boolean ungueltigX = (toX > 0 || toX < 7);
        boolean ungueltigY = (toY > 0 || toY < 7);

        if(ungueltigX == true || ungueltigY == true) {
        }

        // TODO: Ist die Figur überhaupt bewegt worden? Stehenbleiben ist kein gültiger Zug
        // Bedingung: Es muss einer der Koordinaten = 1 sein
        else if(!(deltaX == 0 && deltaY == 0)) {

        }
        // TODO: Prüfen, ob deltaX und deltaY für diese Figur eine gültige Bewegung ist
        // Bedingungen (L-Form; 3:1 oder 1:3)
        // deltaX == 3 && deltaY == 1 XOR
        // deltaX == 1 && deltaY == 3
        else if((deltaX == 2 && deltaY == 1) ^
                (deltaX == 1 && deltaY == 2)) {
            return true;
        } return false;
    }

    // Abstrakte Methode aufrufen
    @Override public String getName( ) {
        return "Springer";
    }
}