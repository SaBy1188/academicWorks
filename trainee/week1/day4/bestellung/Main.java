package de.brightstraining.trainee.week1.day4.bestellung;

public class Main {
    public static void main(String[] args) {

        Adresse adresse1 = new Adresse("Hintere Gasse 31", "70794", "Filderstadt");
        Adresse adresse2 = new Adresse("Olewischtwiet 34b", "22177", "Hamburg");

        Bestellung bestellung = new Bestellung(123654, "Haargel", adresse1, adresse1);

        System.out.println(bestellung);
        bestellung.setRechnungsAdresse( adresse2);
        System.out.println(bestellung);
    }
}