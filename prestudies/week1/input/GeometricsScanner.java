package de.brightstraining.prestudies.week1.input;
import java.util.Scanner;
public class GeometricsScanner {
    public static void main(String[] args){

        System.out.println("Aufgabe 3: Geometrie\nInhalt und Umfang eines Rechtecks\n");

        // Eingabe der Werte durch Scanner Methode.
        // Rectangle Side A

        String inputRectangleA = "Please enter an integer for side A of a rectangle:";
        System.out.println(inputRectangleA);

        Scanner scannerRecA;
        scannerRecA = new Scanner(System.in);

        String rectangleSideA = scannerRecA.next();

        // Rectangle Side B

        String inputRectangleB = "Please enter an integer for side B of a rectangle:";
        System.out.println(inputRectangleB);

        Scanner scannerRecB;
        scannerRecB = new Scanner(System.in);

        String rectangleSideB = scannerRecB.next();

        //double surfaceAreaRectangle = rectangleSideB*rectangleSideA;
        //circumstancesRec = (rectangleSideA*2)+(rectangleSideB*2);


        //System.out.print("Inhalt: ");
        //System.out.println(surfaceAreaRectangle);
/*
        System.out.print("Umfang: ");
        System.out.println(circumstancesRec);

        System.out.println("\nAufgabe 3: Geometrie\nContent and perimeter of a right triangle\n");
*/
        // Right triangle Side A

        String inputTriangleA = "Please enter an integer for side A of a triangle:";
        System.out.println(inputTriangleA);

        Scanner scannerTriA;
        scannerTriA = new Scanner(System.in);

        String triangleSideA = scannerTriA.next();

        // Right triangle Side B

        String inputTriangleB = "Please enter an integer for side B of a triangle:";
        System.out.println(inputTriangleB);

        Scanner scannerTriB;
        scannerTriB = new Scanner(System.in);

        String triangleSideB = scannerTriB.next();

        /*

        inhaltDreieck = (aD*bD)/2;
        hypotenuseDreieck = Math.sqrt((aD*aD)+(bD*bD));
        umfangDreieck = aD+bD+hypotenuseDreieck;

        System.out.print("Inhalt: ");
        System.out.println(inhaltDreieck);
        System.out.print("Hypotenuse: ");
        System.out.println(hypotenuseDreieck);
        System.out.print("Umfang: ");
        System.out.println(umfangDreieck);

         */
    }
}