package de.awacademy.space;

import java.util.HashSet;
import java.util.Set;

public class Mission {
    private Spaceship spaceship;
    private int cargoWeight;
    private Set<Astronaut> crew = new HashSet<>();

    // Konstruktor
    public Mission(Spaceship name) {
        this.spaceship = name;
        this.cargoWeight = 0; // nicht wichtig, wird automatisch mit 0 initialisiert
        // this.crew = new HashSet<>();
    }

    // Crew Member hinzufügen
    public void addCrewMember(Astronaut astronaut) {
        crew.add(astronaut);
    }

    // Crew Größe bestimmen
    public int getCrewSize() {
        return crew.size();
    }

    // Crew Member entfernen
    public void removeCrewMember(Astronaut astronaut) {
        crew.remove(astronaut);
    }

    // Methode Informationsprüfung
    public boolean checkLaunchPermission() {
        /*
        // Mindestens ein Astronaut
        if (crew == null || crew.isEmpty()) {
            return false;
        }

        // Crew Größe nicht größer der Kapazität
        if (spaceship.getCrewCapacity() < crew.size()) {
            return false;
        }

        int crewWeight = getCrewSize() * 100;
        int maxLoadWeight = cargoWeight + crewWeight;

        if (maxLoadWeight > spaceship.getMaxLoadWeight()) {
            return false;
        }
        return true;
        */

        // Lösung: Kurz
        return (crew != null && !crew.isEmpty() && spaceship.getCrewCapacity() >= crew.size() && cargoWeight + (getCrewSize() * 100) <= spaceship.getMaxLoadWeight());
    }

    // Getter, Setter
    public Spaceship getSpaceship() {
        return spaceship;
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }
}