package de.exercises.datentypen;

public class Typumwandlung {
    public static void main(String[] args) {
        short shortNum = 32767;
        int intNum = 2147483647;

        // von klein zu groß
        // Implizite erweiterte Typumwandlung
        int shortToInt = (int) shortNum;
        System.out.println(shortToInt);

        // Explizite erweiterte Typumwandlung
        short intToShort = (short) intNum;
        System.out.println(intToShort);

        // von groß zu klein
        // Implizite einschränkende Typumwandlung
        // shortNum = intNum; -> Kompilierfehler

        // Explizite einschränkende Typumwandlung
        shortNum = (short) intNum;
        System.out.println(shortNum);


        // Division mit einschränkender impliziter Typumwandlung
        short divisionShort = 32767;
        float divisionFloat = divisionShort / 2;
        System.out.println(divisionFloat);
    }
}