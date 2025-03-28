package de.exercises.zeichenketten.bonus.codingbat;

public class MixStart {
    public boolean mixStart(String str) {
        /* Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.

        mixStart("mix snacks") → true
        mixStart("pix snacks") → true
        mixStart("piz snacks") → false */

        String anything = "pizza";
        boolean mix = anything.contains("ix");
        return false;
    }
}
