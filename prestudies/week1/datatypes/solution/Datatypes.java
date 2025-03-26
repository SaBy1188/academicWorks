package de.brightstraining.prestudies.week1.datatypes.solution;
public class Datatypes {
    public static void main(String[] args) {

        // Deine Initialen
        char[] initialen = new char[] { 'O', 'H' };
        String initialenStr = "OH";

        // Einwohnerzahl in Deutschland
        int einwohnerzahl = 82670000;

        // Einwohnerzahl auf der Erde
        long menschen = 7470000000L;

        // Ist gerade Tag?
        boolean istTag = true;

        // Trefferquote von Mario Gomez (statistische Tore pro Spiel) bei Bayern München
        float trefferquote = 0.65F;

        // Dauer in Wochen des Javakurses - üblicherweise wird aber dennoch int verwendet
        byte dauer = 12;

        // Die Zahl PI
        double pi = 3.141592653589793;

        // Variablen mit einer Beschreibung verketten und ausgeben.
        System.out.println("Meine Initialen: " + initialen[0] + initialen[1]);
        System.out.println("Einwohnerzahl in Deutschland: " + einwohnerzahl);
        System.out.println("Menschen auf der Erde: " + menschen);
        System.out.println("Es ist Tag: " + istTag);
        System.out.println("Trefferquote von Mario Gomez: " + trefferquote);
        System.out.println("Dauer des Javakurses: " + dauer);
        System.out.println("Die mathematische Zahl PI: " + pi);
    }
}