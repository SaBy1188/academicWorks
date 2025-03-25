package de.exercises.operatoren.bonus;

public class BonusParseString {
    public static void main(String[] args) {
        int zahl = 3;
        String stringToInt = zahl + "";
        System.out.println(stringToInt);

        String parseString = Integer.toString(zahl);
        System.out.println(parseString);
    }
}
