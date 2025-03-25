package de.exercises.operatoren;

public class Inkrementell {
    public static void main(String[] args) {

        // Code interpretieren
        int i = 0;
        System.out.println(i);      // Gibt den Wert 0 aus
        System.out.println(i++);    // Addiert zur 0, +1; Wert  wird gespeichert ohne auszugeben
        System.out.println(i);      // Gibt den Wert 1 aus
        System.out.println(++i);    // Addiert zur 1, +1; Wert wird direkt ausgegeben
        System.out.println(i);      // Gibt den Wert 2 aus

        // Code interpretieren
        int j = 42;
        int k = j++ + ++j;          // 42 wird um +1 erhöht; Wert wird gespeichert aber nicht ausgegeben
        System.out.println(k);      // (43) + (++j) = 44; j wird wieder um 1 erhöht, aber direkt weiterverwendet
                                    // daher 42 + 44 = 86
    }
}
