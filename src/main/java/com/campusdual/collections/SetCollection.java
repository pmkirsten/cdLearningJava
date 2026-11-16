package com.campusdual.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetCollection {
    static void main() {
        Set<String> instruments = new HashSet<>();
        instruments.add("Piano");
        instruments.add("Guitar");
        instruments.add("Piano");
        instruments.add("Drums");
        instruments.add("Violin");
        instruments.add("Piano");

        System.out.println("Set of musical instruments:");
        for (String ins : instruments){
            System.out.println(ins);
        }

        instruments.remove("Drums");
        instruments.add("Flute");

        System.out.println("Set after modifications:");
        for (String ins : instruments){
            System.out.println(ins);
        }
    }
}
