package de.ithoc.training.exercise.text;

import java.util.Random;

public class TextExercise {
    public static void main(String[] args) {
        TextExercise textExercise = new TextExercise();
        System.out.println(textExercise.randomText(10));
    }

    public String randomText(int textLength) {
        /**
         * Aufgabe:
         * Erzeuge einen Text mit folgenden Kriterien:
         * - Länge exakt 10 Zeichen
         * - Mindestens einen Buchstaben (groß oder klein)
         * - Mindestens eine Zahl (von 0 bis 9)
         * - keine Leerzeichen
         */

        Random randomStringBuilder = new Random();
        StringBuilder randomStringBuilderText = new StringBuilder();

        for (int i = 0; i < textLength; i++) {
            if (i % 2 == 0) {
                char randomLettersBig = (char) (randomStringBuilder.nextInt(26) + 'A');
                randomStringBuilderText.append(randomLettersBig);
            } else if (i % 3 == 0) {
                char randomLettersSmall = (char) (randomStringBuilder.nextInt(26) + 'a');
                randomStringBuilderText.append(randomLettersSmall);
            } else {
                int digit = randomStringBuilder.nextInt(10);
                randomStringBuilderText.append(digit);
            }
        }
        return randomStringBuilderText.toString();

        /*
        // Alternative ohne StringBuilder

        Random randomString = new Random();
        String randomStringText = "";
        for (int i = 0; i < textLength; i++) {
            if (i % 2 == 0) {
                char randomLettersBig = (char) (randomString.nextInt(26) + 'A');
                randomStringText += randomLettersBig;
            } else if (i % 3 == 0) {
                char randomLettersSmall = (char) (randomString.nextInt(26) + 'a');
                randomStringText += randomLettersSmall;
            } else {
                int digit = randomString.nextInt(10);
                randomStringText += digit;
            }
        }
        return randomStringText;
        */

        /*
        // Alternative von Silvia
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghifklmnopqrstuvwxyz";
        String digits = "0123456789";
        String validChars = letters + digits;
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder(textLength);
        boolean hasLetter = false;
        boolean hasDigits = false;
        for (int i = 0; i < textLength; i++) {
            int index = random.nextInt(validChars.length());
            char c = validChars.charAt(index);
            if (Character.isLetter(c)) {
                hasLetter = true;
            } else if (Character.isDigit(c)) {
                hasDigits = true;
            }
            stringBuilder.append(c);
        }
        if (!hasLetter || !hasDigits) {
            return randomText(textLength);
        }

        return stringBuilder.toString();
        */
    }
}
