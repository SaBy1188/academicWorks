package de.brightstraining.trainee.week1.day5.quiz;

public class ZaehlenString {

    public static String zahlZuWort(int zahl) {

        String[] einer = {"ein", "zwei", "drei", "vier", "fünf", "sechs", "sieben", "acht", "neun"};
        String[] zehner = {"zehn", "zwanzig", "dreißig", "vierzig", "fünfzig", "sechzig", "siebzig", "achtzig", "neunzig"};

        int ein = zahl % 10;
        int zehn = zahl / 10;

        String zahlWort = "";

        if (zehn == 0) {
            if (ein == 1) {
                zahlWort = "eins";
            } else {
                zahlWort = einer[ein - 1];
            }
        } else if (zahl == 11) {
            zahlWort = "elf";
        } else if (zahl == 12) {
            zahlWort = "zwölf";
        } else if (zahl == 100) {
            zahlWort = "hundert";
        } else if (ein == 0) {
            zahlWort = zehner[zehn - 1];
        } else if (zahl < 20) {
            zahlWort = einer[ein - 1] + zehner[zehn - 1];
        } else {
            zahlWort = einer[ein - 1] + "und" + zehner[zehn - 1];
        }

        return zahlWort;
    }
}