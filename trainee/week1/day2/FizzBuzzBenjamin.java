package de.brightstraining.trainee.week1.day2;

public class FizzBuzzBenjamin {
    public static void main(String[] args) {

        boolean isThree;
        boolean isFive;

        // 4 Bedingungen
        System.out.println("Methode 1:");
        for (int i = 1; i <= 50; i++) {

            isFive = (i % 5) == 0;
            isThree = (i % 3) == 0;

            if (isThree && isFive) {
                System.out.println("FizzBuzz");
            } else if (isThree) {
                System.out.println("Fizz");
            } else if (isFive) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }


        // String Builder Methode
        System.out.println("Methode 2:");
        StringBuilder stringOut = new StringBuilder();

        for (int i = 1; i <= 50; i++) {

            isFive = (i % 5) == 0;
            isThree = (i % 3) == 0;
            stringOut.setLength(0);

            if (isThree && isFive) {
                stringOut.append("Erdbeerkuchen");
            } else if (isThree) {
                stringOut.append("Schoko");
            } else if (isFive) {
                stringOut.append("Banane");
            } else if (!isThree && !isFive) {
                stringOut.append(i);
            }
            System.out.println(stringOut);
        }
    }
}