package de.brightstraining.trainee.week1.day3;

public class Operatoren {
    public static void main(String[] args) {
        int x = 1;
        
        System.out.println(x);      // i = 1
        System.out.println(x++);    // i = 1, da Postinkrement (rechnet nach Ausführung +1)
        System.out.println(x);      // i = 2, +1 wurde nach der Ausführung hinzugerechnet
        System.out.println(++x);    // i = 3, da Preinkrement (rechnet +1 direkt hinzu)
        System.out.println(x);      // i = 3

        int j = 42;
        int k = j++ + ++j;
        System.out.println("Ergebnis Pre- und Postinkrement: " + k);
        /*Das j startet mit dem Wert 42. In der 2. Zeile addiert der Preinkrement
        + 1 hinzu und erlangt zwar 43, hinterlegt dies aber nur im System ohne es auszugeben.
        Im nächsten Schritt wird der arithmethische Operator (+) ausgeführt
        und addiert zur 42 den Wert von ++j = 44 hinzu. 44, da der Postinkrement die +1
        zur im System hinterlegten 43 addiert. Somit lautet das Ergebnis 86 (42 + 44).
         */

        int i = 43;
        i = i + 100;
        i = i - 24;
        i = i * 2;
        i = i / 5;
        System.out.println("Ergebnis: " + i);

        // umgeformt in assoziative Operatoren

        int l = 43;
        l += 100;
        l -= 24;
        l *= 2;
        l /= 5;
        System.out.println("Ergebnis: " + l);
    }
}