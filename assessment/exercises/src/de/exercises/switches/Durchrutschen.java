package de.exercises.switches;

public class Durchrutschen {
    public static void main(String[] args) {
        char colors = 'W';
        switch (colors) {
            case 'a':
                System.out.println("black");
                break;
            case 'b':
            case 'w':
            case 'W':
            case 'v':
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
