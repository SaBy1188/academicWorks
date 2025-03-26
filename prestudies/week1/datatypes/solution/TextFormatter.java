package de.brightstraining.prestudies.week1.datatypes.solution;

import java.util.Scanner;
public class TextFormatter {
    public static void main(String[] args) {

        System.out.println("Bitte geben Sie einen Text ein, jeweils ein Wort soll in '_' bzw. '#' eingefasst sein: ");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int index1;
        int index2;

        // index1 sucht die Stelle im Text, an der '_' zum ersten Mal auftritt
        // index2 sucht das zweite Auftreten von '_', die Suche muss aber 1 Zeichen nach dem ersten '_' beginnen,
        // da dieses sonst nochmal zurückgegeben würde, daher "index1 +1".
        index1 = text.indexOf("_");
        index2 = text.indexOf("_", index1 + 1);

        String target1;
        String replacement1;

        // target1 definiert die exakte Position der Stelle im Text ("_Wort1_"), welche durch replacement1 ersetzt
        // werden soll ("index2 + 1" weil per Definition der substring bei "index2 - 1" enden würde).
        // replacement1 definiert das Wort ohne die beiden '_' in Grossbuchstaben.
        target1 = text.substring(index1, index2 + 1);
        replacement1 = text.substring(index1 + 1, index2).toUpperCase();

        String textFormat1;

        // Der erste formatierte Teil des Textes (in Grossbuchstaben, ohne '_').
        textFormat1 = text.replace(target1, replacement1);

        int index3;
        int index4;

        // analog index1 und index2, nur dass nicht mehr vom original eingegebenen Text, sondern vom ersten formatierten
        // Text (textFormat1) ausgegangen werden muss, da sich durch die Formatierung die Zeichenlänge verändert hat
        // (die beiden '_' fallen weg).
        index3 = textFormat1.indexOf("#");
        index4 = textFormat1.indexOf("#", index3 + 1);

        String target2;
        String replacement2;

        target2 = textFormat1.substring(index3, index4 + 1);
        replacement2 = textFormat1.substring(index3 + 1, index4).toLowerCase();

        String textFormat2;
        textFormat2 = textFormat1.replace(target2, replacement2);

        System.out.println(textFormat2);

    }
}