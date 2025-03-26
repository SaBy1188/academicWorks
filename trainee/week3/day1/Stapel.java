package de.brightstraining.trainee.week3.day1;

import java.util.*;


public class Stapel {
    public static void main(String[] args) {
        List<Integer> zahlen = new ArrayList<>( );
        zahlen.add(1);
        zahlen.add(2);
        zahlen.add(3);
        zahlen.add(4);
        System.out.println("vorher: " + zahlen);

/*        int reverseArrayListZahlen = zahlen.size() -1;

        for(int i = reverseArrayListZahlen; i >= 0; i--) {
            System.out.print("nachher: " + zahlen.get(i));*/

        /*Collections.reverse(zahlen);
        System.out.println(zahlen);*/


        // Ausgabe mit Stack umkehren
        Queue<Integer> integerQueue = new LinkedList<>( );
        Deque<Integer> integerDeque = new LinkedList<>( );

        for(Object x : zahlen.toArray( )) {
            integerQueue.add((Integer) x);

        }
        while(!integerQueue.isEmpty( )) {
            integerDeque.push(integerQueue.remove( ));
        }

        while(!integerDeque.isEmpty( )) {
            System.out.print(integerDeque.pop( ));
        }
        System.out.println( );
    }
}