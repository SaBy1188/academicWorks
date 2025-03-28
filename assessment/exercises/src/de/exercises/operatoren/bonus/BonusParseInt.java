package de.exercises.operatoren.bonus;

import java.util.Scanner;

public class BonusParseInt {
    public static void main(String[] args) {
        String integer = "123450";
        int stringToInt = Integer.parseInt(integer);
        System.out.println(stringToInt);

        int rechnung = stringToInt + 5;
        System.out.println(rechnung);


        // Bonus Bonus: Scannereingabe mit Methodenauslagerung
        int scannerRechnung = BonusParseInt.eingabeString() + 5;
        System.out.println(scannerRechnung);
    }

    public static int eingabeString() {
        Scanner scanner = new Scanner(System.in);
        String inputScanner = scanner.next();
        int inputToInt = Integer.parseInt(inputScanner);

        return inputToInt;
    }
}
