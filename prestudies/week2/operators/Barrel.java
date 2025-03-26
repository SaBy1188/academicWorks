package de.brightstraining.prestudies.week2.operators;
public class Barrel {
    public static void main(String[] args) {
        double circumference = 32;
        double height = 10;
        double bottonDiameter;
        double floorArea;
        double coatArea;
        double totalArea;

        bottonDiameter = circumference / Math.PI;
        //floorArea = Math.PI * (bottonDiameter / 2) * (bottonDiameter / 2);
        floorArea = Math.PI * Math.pow((bottonDiameter / 2), 2);
        coatArea = circumference * height;
        totalArea = (2 * floorArea) + coatArea;
        //capacity = Math.PI * ((bottonDiameter / 2) * (bottonDiameter / 2)) * height;
        double capacity = Math.PI * Math.pow((bottonDiameter / 2), 2) * height;

        System.out.println("The capacity of the barrel is: " + capacity
        + "\nThe total area of the barrel is: " + totalArea);
    }
}