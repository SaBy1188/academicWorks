package de.brightstraining.prestudies.week3.arrays.solution;

public class MaxMin {

    public static void main(String[] args) {

        int[] werte = new int[] { 1, 4, 5, 7, 20000, -511, 100, -200, 400 };

        // Wir bedienen uns eines kleinen Hilfsmittels:
        // Der minimal mögliche Wert eines int ist -2147483648.
        // Jeder Wert ist auf jeden Fall größer oder gleich
        // diesen Wertes.
        int maximum = Integer.MIN_VALUE;
        for(int i = 0; i < werte.length; i++) {

            // Ermittle für jedes Element, ob es größer als das
            // Maximum ist. Falls ja, überschreibe das letzte
            // Maximum mit dem neuen Maximum.
            if(werte[i] > maximum) {
                maximum = werte[i];
            }
        }

        // Nun haben wir das Maximum und geben es aus.
        System.out.println("Maximum: " + maximum);

        // Analog gehen wir mit dem Minimum um. Nur das wir als
        // anfängliches Minimum das größtmögliche int hernehmen.
        int minimum = Integer.MAX_VALUE;
        for(int i = 0; i < werte.length; i++) {

            if(werte[i] < minimum) {
                minimum = werte[i];
            }
        }

        // Zu guter Letzt geben wir auch das Minimum aus.
        System.out.println("Minimum: " + minimum);
    }
}