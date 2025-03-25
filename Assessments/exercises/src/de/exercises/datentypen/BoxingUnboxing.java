package de.exercises.datentypen;

public class BoxingUnboxing {
    public static void main(String[] args) {

        // Boxing = Klassen primitive Datentypen zuweisen
        Boolean a = Boolean.valueOf(true);
        Byte b = Byte.valueOf("127"); // Warum String?
        Character c = Character.valueOf('a');
        Short d = Short.valueOf("20000"); // Warum String?
        Integer e = Integer.valueOf(1234567);
        //Long f = Long.valueOf(1.45L);
        Double g = Double.valueOf(3.14159265359);

        // Unboxing = primitiven Datentypen Werte aus vorherigen Klassen zuweisen
        boolean one = a.booleanValue();
        char two = c.charValue();
        int three = e.intValue();
        double four = g.doubleValue();


        // Bonus Autoboxing
        Integer x = Integer.valueOf(3);
        Double y = Double.valueOf(5.0);
        double z = (x * 4) - (y / 8) + 7;
        System.out.println(z);

        // Bonus Boxing
        double w = (x.intValue() * 4) - (y.doubleValue() / 8) + 7;
        System.out.println(w);
    }
}