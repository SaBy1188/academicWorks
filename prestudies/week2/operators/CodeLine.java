package de.brightstraining.prestudies.week2.operators;

public class CodeLine {
    public static void main(String[] args) {

        // Original Codezeilen
        /*double x = 15.5 ;
        double a = Math. sqrt ( 3.5 + x);
        double b = a * 5 ;
        double c = b / 3 ;
        double d = x + 10 ;
        double e = x - 4.1 ;
        double f = d * e;
        double g = c - f;
        System. out .println(g);*/

        // Gekürzte Codezeilen
        double x = 15.5, g = ((((Math.sqrt((3.5 + x))) * 5) / 3) - ((x + 10) * (x - 4.1)));

        System.out.println(g);
    }
}