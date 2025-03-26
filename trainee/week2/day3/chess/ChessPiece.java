package de.brightstraining.trainee.week2.day3.chess;

// https://www.spielezar.ch/blog/spielregeln/zug-und-schlagmoeglichkeiten-der-schachfiguren#:~:text=Beim%20Schachspiel%20gibt%20es%20drei,Rochade%20d%C3%BCrfen%20zwei%20Figuren...
public abstract class ChessPiece {

    private int x;

    private int y;

    private boolean white;  // Spielerfigur Farbe


    public ChessPiece(boolean white,int x,int y) {
        // Konstruktor: Wird verwendet, um die IST und SOLL Position zu definieren
        this.white = white;
        this.x = x;
        this.y = y;
    }

    public boolean canMove(int x, int y) {
        return true;
    }
    // Methode: Zug wird geprüft (Schachbrett Ende; gültiger Zug)

    public void move(int x, int y) {
        // Methode: Spielzug; Wohin bewegt sich die Figur?
        if (canMove(x, y)) {
            this.x = x;
            this.y = y;
        }
    }

    // Abstrakte Methode einfügen
    public abstract String getName();


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isWhite() {
        return white;
    }
}