package de.exercises.operatoren.bonus.codingbat;
// Exercises: https://codingbat.com/java/Warmup-1
// Solution: https://codingbat.com/doc/java-if-boolean-example-solution-code-2.html
public class Close10 {
    /* Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
    Note that Math.abs(n) returns the absolute value of a number.

    close10(8, 13) → 8
    close10(13, 8) → 8
    close10(13, 7) → 0*/
    public int close10(int a, int b) {
        int diffA = Math.abs(10 - a);
        int diffB = Math.abs(10 - b);

        if (diffB > diffA) {
            return a;
        } else if (diffA > diffB) {
            return b;
        } return 0;
    }
}