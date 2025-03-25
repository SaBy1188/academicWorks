package de.exercises.switches.bonus;

public class BonusSwitchMethoden {
    public static void main(String[] args) {
        char input = 'c';

        switch (input) {
            case 'a':
                handleA("a");
                break;
            case 'b':
                handleB("b");
                break;
            case 'c':
                handleC("c");
                break;
        }
    }
    private static void handleA(String a) {
        System.out.println(a);
    }

    private static void handleB(String b) {
        System.out.println(b);
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    private static void handleC(String c) {
        System.out.println(c);
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
