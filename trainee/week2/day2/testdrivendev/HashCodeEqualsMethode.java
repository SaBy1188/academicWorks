package de.brightstraining.trainee.week2.day2.testdrivendev;

public class HashCodeEqualsMethode {

    private int x = 7;

    private String a = "Hallo";

    @Override public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof HashCodeEqualsMethode hashCodeEqualsMethode)) return false;

        if(x != hashCodeEqualsMethode.x) return false;
        return a.equals(hashCodeEqualsMethode.a);
    }

    @Override public int hashCode( ) {
        int result = x;
        result = 31 * result + a.hashCode( );
        return result;
    }
}