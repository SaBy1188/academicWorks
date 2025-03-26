package de.ithoc.training.exercise.loop;

import de.ithoc.training.exercise.text.TextExercise;
import java.util.*;
import java.util.stream.Collectors;

public class LoopExercise {
    public static void main(String[] args) {
        LoopExercise loopExercise = new LoopExercise();
        // System.out.println(loopExercise.generateTextList());
        System.out.println(loopExercise.printTextList(loopExercise.generateTextList()));
    }

    /**
     * Erzeuge eine Liste (List list = new ArrayList()) mit 1000 Elementen. Füge in einer for-Schleife
     * jeweils einen aus TextExercise zufällig generierten Text in die Liste, sodass am Ende eine Liste
     * mit Elementtypen String und voraussichtlich unterschiedlichen Texten besteht.
     * Stellt den einzelnen Elementen den Index aus der Schleife voran.
     */
    public List<String> generateTextList() {
        /*
        int n = 1000;
        List<String> list = new ArrayList<>(n);
        Set<String> set = new HashSet<>(n);
        TextExercise text = new TextExercise();

        for (int i = 1; i < n + 1; i++) {           // Index 1 - 1000
            String randomText = text.randomText(10);
            if (!set.contains(randomText)) {        // keine doppelten RandomTexte
                list.add(i + ": " + randomText + "\n");
            }
        }
        return list;*/

        // Lösung mit Stream
        int n = 1000;
        List<String> list;
        List<String> result = new ArrayList<>(n);
        TextExercise text = new TextExercise();
        Random random = new Random();

        // Stream von zufälligen Texten generieren
        list = random.ints(n, 10, 11)
                .mapToObj(i -> text.randomText(i))
                .distinct()
                .map(s -> String.format("%-10s",s))
                .collect(Collectors.toList());

        // Liste mit Index und Text generieren
        for (int i = 0; i < n; i++) {
            result.add(i + ": " + list.get(i) + "\n");
        }

        return result;
    }

    public String printTextList(List<String> list) {
        /**
         * Erzeuge einen Text, der alle Elemente der gegebenen Liste enthält.
         * Dabei steht jedes Element in * einer eigenen Zeile.
         */
        StringBuilder textStringBuilder = new StringBuilder();

        for (String element : list) {
            textStringBuilder.append(element).append("\n");
        }

        return textStringBuilder.toString();
    }
}
