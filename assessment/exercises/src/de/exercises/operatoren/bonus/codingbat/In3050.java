package de.exercises.operatoren.bonus.codingbat;
// Exercises: https://codingbat.com/java/Warmup-1
// Solution: https://codingbat.com/doc/java-if-boolean-example-solution-code-2.html
public class In3050 {
    /*  Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.
        in3050(30, 31) → true
        in3050(30, 41) → false
        in3050(40, 50) → true*/
    public boolean in3050(int a, int b) {
        if (a >= 30 && a <= 40 && b >= 30 && b <= 40) {
            return true;
        } else if ((a >= 40 && a <= 50 && b >= 40 && b <= 50)) {
            return true;
        } return false;
    }
}
