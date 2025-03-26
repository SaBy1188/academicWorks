package de.brightstraining.prestudies.week1.input;
public class GeometricsConstant {
    public static void main(String[] args){

        System.out.println("Aufgabe 3: Geometrie\nInhalt und Umfang eines Rechtecks\n");

        //Konstante Zahlen zur Berechnung.
        float recSideA = 5f; float recSideB = 3f;

        //Formeln zur Berechnung der Fläche und des Umfangs.
        double surfaceAreaRec = recSideA*recSideB;
        double circumstancesRec = (recSideA*2)+(recSideB*2);

        //Ausgabe
        System.out.print("Seite A: ");
        System.out.println(recSideA);
        System.out.print("Seite B: ");
        System.out.println(recSideB);

        System.out.print("\nInhalt: ");
        System.out.println(surfaceAreaRec);

        System.out.print("Umfang: ");
        System.out.println(circumstancesRec);


        System.out.println("\nAufgabe 3: Geometrie\nFläche und Umfang eines rechtwinkligen Dreiecks\n");

        //Konstante Zahlen zur Berechnung.
        float triSideA = 7f; float triSideB = 3f;

        //Formeln zur Berechnung der Fläche, des Umfangs und der Hypotenuse.
        double surfaceAreaTri = (triSideA*triSideB)/2;
        double hypotenuseTri = Math.sqrt((triSideA*triSideA)+(triSideB*triSideB));
        double circumstancesTri = triSideA+triSideB+hypotenuseTri;

        //Ausgabe
        System.out.print("Seite A: ");
        System.out.println(triSideA);
        System.out.print("Seite B: ");
        System.out.println(triSideB);

        System.out.print("\nInhalt: ");
        System.out.println(surfaceAreaTri);
        System.out.print("Hypotenuse: ");
        System.out.println(hypotenuseTri);
        System.out.print("Umfang: ");
        System.out.println(circumstancesTri);
    }
}