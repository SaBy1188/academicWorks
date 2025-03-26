package de.brightstraining.prestudies.week2.loops;
import java.util.Scanner;
public class GuessingNumbers {
    public static void main(String[] args) {

        // Scannereingabe
        Scanner scannerRandomNumber = new Scanner(System.in);

        // Zahlenspektrum
        int randomNumber = (int) ((Math.random() * 100) + 1);
        int count = 0;

        System.out.println("Guess what number is being searched for. It ranges between 0 and 100.");

        // Schleife wiederholen bis Zahl erraten wurde
        int tip = 0;
        while (tip != randomNumber) {
            count++;
            System.out.println("Your " + count + ". try: ");
            tip = scannerRandomNumber.nextInt();

            if (tip == randomNumber) {
                System.out.println("Lucky you."
                        + "You entered the number" + " (" + tip + ")"
                        + ". This is correct.");
            } else if (tip < randomNumber) {
                System.out.println("""
            Bad luck.
            This number is too small.
            Try again.
            """);
            } else if (tip > randomNumber) {
                System.out.println("""
            Oopsie.
            The number is too big.
            Next try.
            """);
            } else {
                scannerRandomNumber.close();
            }
        }
    }
}