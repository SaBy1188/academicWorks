package de.exercises.operatoren.bonus.codingbat;

// Exercises: https://codingbat.com/java/Warmup-1
// Solution: https://codingbat.com/doc/java-if-boolean-example-solution-code-1.html
public class SleepIn {
    /*
    The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
    We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

    sleepIn(false, false) → true
    sleepIn(true, false) → false
    sleepIn(false, true) → true*/
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }
}
