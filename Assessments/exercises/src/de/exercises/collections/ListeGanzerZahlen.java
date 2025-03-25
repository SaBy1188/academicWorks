package de.exercises.collections;

import java.util.ArrayList;
import java.util.List;

public class ListeGanzerZahlen {
    public static void main(String[] args) {
        List<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(204);
        listOfNumbers.add(-468);
        listOfNumbers.add(827);
        listOfNumbers.add(-90235);
        listOfNumbers.add(45869);
        listOfNumbers.add(27);
        listOfNumbers.add(-35687);
        listOfNumbers.add(67);

        System.out.println("Max: " + getMax(listOfNumbers));
        System.out.println("Max: " + getMin(listOfNumbers));
    }

    protected static int getMax(List<Integer> maxNumbers) {
        int currentMaxValue = Integer.MIN_VALUE;
        for (Integer value : maxNumbers) {
            if (value > currentMaxValue) {
                currentMaxValue = value;
            }
        }
        return currentMaxValue;
    }

    protected static int getMin(List<Integer> minNumbers) {         // List<Integer>  =>  Datentyp; minNumber  =>  Variablenname
        int currentMaxValue = Integer.MAX_VALUE;
        for (Integer value : minNumbers) {                          // Integer = Datentyp, value = Bezeichner/Variable : minNumber = Referenz (über welche Liste soll iteriert werden?)
            if (value < currentMaxValue) {
                currentMaxValue = value;
            }
        }
        return currentMaxValue;
    }
}
