package com.campusdual.variables;

public class Variable {
    static void main() {
        double hours = 2.5;
        int month = 12;
        String name = "Ramiro";
        final int DAY_HOURS = 24;
        System.out.println(hours);
        System.out.println(month);
        System.out.println(name);
        System.out.println(DAY_HOURS);
        name = "Pablo";
        System.out.println(name);
        // DAY_HOURS = 25; ← NO SE PUEDE HACER
        System.out.println(DAY_HOURS);

    }
}
