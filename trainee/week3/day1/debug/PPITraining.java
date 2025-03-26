package de.brightstraining.trainee.week3.day1.debug;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PPITraining {

    public static void main(String[] args) {
        new PPITraining( ).run( );
    }

    private void run( ) {
        List<Trainee> traineeList = createTrainees( );

        // Berechne, welche Trainees die Graduation geschafft haben.
        List<Trainee> graduatedTraineeList = filterGraduatedTrainees(traineeList);

        Scanner scanner = new Scanner(System.in);

        String name = "";
        do {
            System.out.println("Für welchen Namen möchtest Du prüfen, ob der Trainee graduiert ist?");
            System.out.print("Name=");
            name = scanner.nextLine( );
            Trainee traineeToCheck = new Trainee(name);
            boolean isGraduated    = graduatedTraineeList.contains(traineeToCheck);
            System.out.println(name + " ist " + (isGraduated ? "graduiert" : "nicht graduiert"));
            System.out.println( );
        } while(!name.equals(""));
    }

    private List<Trainee> createTrainees( ) {
        return Arrays.asList(
                // Alphabetisch nach Nachname, wie in Canvas
                new Trainee("Andreas"),
                new Trainee("Sabrin"),
                new Trainee("Ensar"),
                new Trainee("Silvia"),
                new Trainee("Christian"),
                new Trainee("Benjamin"),
                new Trainee("Christiane"),
                new Trainee("Corinna"),
                new Trainee("Thomas"),
                new Trainee("Tim"),
                new Trainee("Chan"));
    }

    private List<Trainee> filterGraduatedTrainees(List<Trainee> traineeList) {
        List<Trainee> result = new ArrayList<>(traineeList);
        return result;
    }
}