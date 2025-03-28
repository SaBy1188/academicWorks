package de.exercises.zeichenketten;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        String remove = "+49 179.234 58.9";
        if (remove.startsWith("+49")) {
            remove = remove.substring(3);
        }

        remove = remove.replace(".","");
        remove = remove.replace(" ","");

        System.out.println(remove);


        String zahlenReihe = "123, -4, 490, -294";
        String[] zahlenArray  = zahlenReihe.split(",");
        zahlenReihe = zahlenReihe.replace(" ","");
        String positiveZahlen = "";
        String komma = "";

        for (String zahl : zahlenArray) {
            zahl = zahl.trim();
            if (zahl.startsWith("-")) {
                positiveZahlen += komma + "0";
            } else {
                positiveZahlen += komma + zahl;
            } komma = ", ";
        }
        System.out.println(positiveZahlen);


        String punkt = "Mach mal nen";
        if (!punkt.endsWith(".")) {
            System.out.println(punkt + ".");
        } else {
            System.out.println(punkt);
        }
    }
}
