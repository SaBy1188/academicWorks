package de.brightstraining.trainee.week1.day2;

public class FizzBuzz {
    public static void main(String[] args) {
        fizzBuzz(100);
    }

    private static void fizzBuzz(int endValue) {
        for (int i = 1; i <= endValue; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}