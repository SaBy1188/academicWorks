package de.exercises.online;

public class Vowels {

    public static int getCount(String str) {
        int count = 0;

        for (char vowel : str.toCharArray()) {
            if (vowel == 'a') {
                count++;
            }
            if (vowel == 'e') {
                count++;
            }
            if (vowel == 'i') {
                count++;
            }
            if (vowel == 'o') {
                count++;
            }
            if (vowel == 'u') {
                count++;
            }
        }
        // return count;


        // Alternativen:
        for (char c : str.toCharArray())
            count += (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;

        // return count;


        // Alternative
        for(int i = 0; i < str.length(); i++) {
            switch(str.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
            }
        }
        return count;

    }
}