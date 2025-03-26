package de.brightstraining.trainee.week2.day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Listen {
    public static void main(String[] args) {
        ArrayList<Integer> ganzeZahlen = new ArrayList<Integer>( );
        ganzeZahlen.add(2);
        ganzeZahlen.add(100);
        ganzeZahlen.add(-289);
        ganzeZahlen.add(83);
        ganzeZahlen.add(10_997);

        // SUMME
        int summeArrayListe = 0;
        for(Integer zahlen : ganzeZahlen) {
            summeArrayListe += zahlen;
        }
        System.out.println("Summe: " + summeArrayListe);


        // AUSGABE MAXIMUM
        System.out.println(getMaximum(ganzeZahlen));
        System.out.println(findMaximum(ganzeZahlen));
        //System.out.println(minimum(ganzeZahlen));
    }

    // LÖSUNGSANSÄTZE

    private static Integer findMaximum(List<Integer> list) {
        Integer maxInt = Integer.MIN_VALUE;

        for(Integer integerObject : list) {
            if(integerObject > maxInt) {
                maxInt = integerObject;
            }
        } return maxInt;
    }

    // ODER SO:

    private static void geradeZahlen(List<Integer> ganzeZahlen) {
        System.out.println("Gerade Zahlen: ");

        for(Integer gerade : ganzeZahlen) {
            if((gerade % 2) == 0) {
                System.out.println(gerade);
            }
        }
    }

    private static void minimum(List<Integer> ganzeZahlen) {
        int min = Collections.min(ganzeZahlen);
        System.out.println("Minimum: " + min);
    }

    private static void maximum(List<Integer> ganzeZahlen) {
        int max = Collections.max(ganzeZahlen);
        System.out.println("Maximum:" + max);
    }

    // ODER SO:

    public static Integer getMaximum(List<Integer> zahlenliste) {
        if(zahlenliste.isEmpty()) {
            throw new IllegalArgumentException( "Liste ist leer" );
        } else {
            return Collections.max(zahlenliste);
        }
    }

    public static List<Integer> findEven(List<Integer> zahlenliste) {
        if(zahlenliste.isEmpty()) {
            throw new IllegalArgumentException( "Liste ist leer" );
        } else {
            List<Integer> geradeZahlen = new ArrayList<>();
            for(Integer zahl : zahlenliste) {
                if(zahl % 2 == 0) {
                    geradeZahlen.add(zahl);
                }
            }
            return geradeZahlen;
        }
    }
}