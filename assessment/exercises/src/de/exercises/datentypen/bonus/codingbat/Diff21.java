package de.exercises.datentypen.bonus.codingbat;

public class Diff21 {
    public int diff21(int n) {
        /*
        Given an int n, return the absolute difference between n and 21,
        except return double the absolute difference if n is over 21.

        diff21(19) → 2
        diff21(10) → 11
        diff21(21) → 0*/
        int difference;
        if (n < 21) {
            difference = Math.abs(21 - n);
        } else {
            difference = Math.abs((21 - n) * 2);
        }
        return difference;
    }
}
