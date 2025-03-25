package de.exercises.switches.bonus;

import java.util.Scanner;

public class BonusMonat {
    public static void main(String[] args) {
        BonusMonat.getMonatName(11);
    }

    public static String getMonatName(int monthNum) {
        String monthName = "";

        switch (monthNum) {
            case 1:
                System.out.println(monthName = "Jan");
                break;
            case 2:
                System.out.println(monthName = "Feb");
                break;
            case 3:
                System.out.println(monthName = "Mar");
                break;
            case 4:
                System.out.println(monthName = "Apr");
                break;
            case 5:
                System.out.println(monthName = "May");
                break;
            case 6:
                System.out.println(monthName = "Jun");
                break;
            case 7:
                System.out.println(monthName = "Jul");
                break;
            case 8:
                System.out.println(monthName = "Aug");
                break;
            case 9:
                System.out.println(monthName = "Sep");
                break;
            case 10:
                System.out.println(monthName = "Oct");
                break;
            case 11:
                System.out.println(monthName = "Nov");
                break;
            case 12:
                System.out.println(monthName = "Dec");
                break;
            default:
                System.out.println("no month");
        }
        return monthName;
    }
}
