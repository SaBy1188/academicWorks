package de.brightstraining.trainee.week1.day2;

import java.util.Scanner;
public class AlterOperatoren {
    public static void main(String[] args) {
        Scanner scanAlter = new Scanner(System.in);
        int alterEingabe;

        System.out.println("Bitte gib dein Alter ein:");
        alterEingabe = scanAlter.nextInt();

        if (alterEingabe >= 60) {
            System.out.println("Du bist alt");
        } else if (alterEingabe >= 40 && alterEingabe < 60) {
            System.out.println("Du bist in der Blüte deines Lebens");
        } else if (alterEingabe >= 20 && alterEingabe < 40) {
            System.out.println("Du bist ein Jungspund");
        } else if (alterEingabe < 20) {
            System.out.println("Du bist ein junger Hüpfer");
        }
    }
}