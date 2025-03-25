package de.exercises.operatoren.bonus.codingbat;
// Exercises: https://codingbat.com/java/Warmup-1
// Solution: https://codingbat.com/doc/java-if-boolean-example-solution-code-2.html
public class IOneTeen {
    /* We'll say that a number is "teen" if it is in the range 13..19 inclusive.
    Given 2 int values, return true if one or the other is teen, but not both.

    loneTeen(13, 99) → true
    loneTeen(21, 19) → true
    loneTeen(13, 13) → false*/
    public boolean IoneTeen(int a, int b) {
        if (a >= 13 && a <= 19 && !(b >= 13 && b <= 19)) {
            return true;
        } else if (!(a >= 13 && a <= 19) && b >= 13 && b <= 19) {
            return true;
        }
        return false;
    }
}
