package de.brightstraining.trainee.week2.day4.exception.calculatorexception;

public class DivisionByZeroMain {
    public static void main(String[] args) {
        DivisionByZero rechne = new DivisionByZero();

        rechne.plus(10);

        try {
            rechne.geteilt(0);
        } catch(DivisionByZeroException exp) {
            exp.printStackTrace();
            System.out.println(exp.getZahl());
            System.out.println(exp.getZahl());
        }

    }
}