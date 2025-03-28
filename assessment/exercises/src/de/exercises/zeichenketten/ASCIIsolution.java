package de.exercises.zeichenketten;

public class ASCIIsolution {
    public static void main(String[] args) {
        System.out.printf("   ");
        for (int i = 0; i < 16; i++) {
            System.out.printf("%2s ", i);
        }
        System.out.println();

        for (int i = 0; i < 16; i++) {
            System.out.printf("%2s ", i);
            for (int j = 0; j < 16; j++) {
                int position = i * 16 + j;

                char c = (char) position;
                if (position < 32) {
                    c = '.';
                }
                System.out.printf("%2s ", c);
            }

            System.out.println();
        }
    }
}
