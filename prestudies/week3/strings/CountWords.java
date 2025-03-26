package de.brightstraining.prestudies.week3.strings;
import java.util.StringTokenizer;

public class CountWords {
    public static void main(String[] args) {
        String exampleText =
        "Die Nacht war kalt und sternenklar, \n"
        + "da trieb im Meer bei Norderney \n"
        + "ein Suahelischnurrbarthaar. \n"
        + "Die nächste Schiffsuhr wies auf drei. \n"
        + "Mir scheint da mancherlei nicht klar. \n"
        + "Man fragt doch, wenn man Logik hat, \n"
        + "was sucht ein Suahelihaar \n"
        + "denn nachts um drei am Kattegatt?\n";


        // Wörter zählen mit Tokenizer

        StringTokenizer tokenizerText = new StringTokenizer(exampleText);

        int countWordsToken = tokenizerText.countTokens();

        System.out.println(exampleText);
        System.out.println("Words count in this text: " + (countWordsToken));


        // Wörter zählen mit String.length();
        //int countWordsSplit = exampleText.split("\\w").length;
        int countWordsSplit = 1;

        for (int i = 0; i < exampleText.length() - 1; i++) {
            if ((exampleText.charAt(i) == ' ') && (exampleText.charAt(i + 1) != ' '))
        {
            countWordsSplit++;
        }
        }
        System.out.println("Words count in this text: " + countWordsSplit);
    }
}