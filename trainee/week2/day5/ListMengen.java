package de.brightstraining.trainee.week2.day5;

import java.util.*;
import java.util.Set;

public class ListMengen {
    public static void main(String[] args) {
        List<Integer> listA = Arrays.asList(1,2,3,4,5,6);
        List<Integer> listB = Arrays.asList(4,5,6,7,8,9);


        // Vereinigungsmengen mit HashSet
        HashSet<Integer> setAll = new HashSet<>();
        setAll.addAll(listA);
        setAll.addAll(listB);
        System.out.println(setAll);

        /* unnötiger Teil
        ArrayList<Integer> vereinigungsmengeHashSet = new ArrayList<>();
        vereinigungsmengeHashSet.addAll(setAll);
        System.out.println("Vereinigungsmenge mit HashSet: " + vereinigungsmengeHashSet);
        */


        // Vereinigungsmenge ohne HashSet
        ArrayList<Integer> vereinigungsmenge = new ArrayList<>(listA);
        //vereinigungsmenge.addAll(listB);

        for(Integer element : listB) {
            if(!vereinigungsmenge.contains(element)) {
                vereinigungsmenge.add(element);
            }
        }
        System.out.println("Vereinigungsmenge ohne HashSet: " + vereinigungsmenge);


        // Schnittmenge
        ArrayList<Integer> schnittmenge = new ArrayList<>(listA);
        schnittmenge.retainAll(listB);
        System.out.println("Schnittmenge: " + schnittmenge);


        // Differenzmenge mit FOREACH
        ArrayList<Integer> listDifference = new ArrayList<>();

        for(int x : listA) {
            if(!listB.contains(x))
                listDifference.add(x);
        }

        for(int x : listB) {
            if(!listA.contains(x))
                listDifference.add(x);
        }
            System.out.println("Differenzmenge: " + listDifference);


        // Differenzmenge mit HashSet
        Set<Integer> listAHashSet = new HashSet<>(listA);
        Set<Integer> listBHashSet = new HashSet<>(listB);
        //Set<Integer> listDifHashSet = Sets


        //listDifHashSet.addAll(listB);
        //listDifHashSet.removeIf(listB::contains);
        //System.out.println(listDifHashSet + "Test");
    }
}