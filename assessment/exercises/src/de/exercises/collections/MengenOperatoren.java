package de.exercises.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MengenOperatoren {

    public static void test() {
        MengenOperatoren.main(new String[1]);
        MengenOperatoren.main("eins", "zwei");
    }
    public static void main(String... args) {
        List<Integer> listA = Arrays.asList(1,2,4,5,6);
        List<Integer> listB = Arrays.asList(5,6,7,8,9);

        List<Integer> vereinigungsmenge = new ArrayList<>();

        for (Integer value : listA) {
            if (!vereinigungsmenge.contains(value)) {
                vereinigungsmenge.add(value);
            }
        }

        for (Integer value : listB) {
            if (!vereinigungsmenge.contains(value)) {
                vereinigungsmenge.add(value);
            }
        }

        System.out.println(vereinigungsmenge);


        List<Integer> schnittmenge = new ArrayList<>();

    }
}
