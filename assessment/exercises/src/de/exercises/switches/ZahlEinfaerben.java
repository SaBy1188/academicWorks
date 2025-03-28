package de.exercises.switches;

public class ZahlEinfaerben {
    public static void main(String[] args) {
        int color = 1;
        switch (color) {
            case 1:
                System.out.println("black");
                break;
            case 2:
                System.out.println("white");
                break;
            case 3:
                System.out.println("red");
                break;
            case 4:
                System.out.println("green");
                break;
            default:
                System.out.println("nope");
                break;
        }

        char stillColor = 'a';
        switch (stillColor) {
            case 'a':
                System.out.println("black");
                break;
            case 'b':
                System.out.println("white");
                break;
            case 'c':
                System.out.println("red");
                break;
            case 'd':
                System.out.println("green");
                break;
            default:
                System.out.println("nope");
                break;
        }
    }
}
