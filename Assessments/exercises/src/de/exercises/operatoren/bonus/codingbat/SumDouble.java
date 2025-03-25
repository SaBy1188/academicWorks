
package de.exercises.operatoren.bonus.codingbat;

// Exercises: https://codingbat.com/java/Warmup-1
// Solution: https://codingbat.com/doc/java-if-boolean-example-solution-code-1.html
public class SumDouble {
    /* Given two int values, return their sum. Unless the two values are the same, then return double their sum.

    sumDouble(1, 2) → 3
    sumDouble(3, 2) → 5
    sumDouble(2, 2) → 8*/
    public int sumDouble(int a, int b) {
        int sum = a + b;
        if (a == b) {
            return sum = (a + b) * 2;
        } else {
            return sum;
        }
    }
}
