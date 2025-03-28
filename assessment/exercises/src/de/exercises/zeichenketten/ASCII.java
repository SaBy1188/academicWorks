package de.exercises.zeichenketten;

public class ASCII {
    // ASCII Tabelle anzeigen; formatieren
    // 0-127, 128 - 255 = erweiterte Tabelle
    // https://www.joelonsoftware.com/2003/10/08/the-absolute-minimum-every-software-developer-absolutely-positively-must-know-about-unicode-and-character-sets-no-excuses/

    public ASCII() {
        for (int i = 1; i < 257; i++) {
            System.out.print(i + ": " + (char)i + "\t");
            if (i % 8 == 0) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        new ASCII();
    }
}
