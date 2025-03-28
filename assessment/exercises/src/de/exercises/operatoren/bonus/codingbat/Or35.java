package de.exercises.operatoren.bonus.codingbat;

public class Or35 {
    public boolean or35(int n) {
        /*
        Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
        Use the % "mod" operator -- see Introduction to Mod

        or35(3) → true
        or35(10) → true
        or35(8) → false
        */
        return (n % 5 == 0 || n % 3 == 0);
    }
}
