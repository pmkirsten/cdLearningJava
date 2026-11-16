package com.campusdual.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCollection {
    static void main() {

        List<String> instruments = new ArrayList<>();

        instruments.add("Guitar");
        instruments.add("Piano");
        instruments.add("Drum");
        instruments.add("Bass");
        instruments.add("Bass");
        instruments.add("Bass");
        instruments.add("Bass");

        for (int i = 0; i < instruments.size(); i++) {
            System.out.println("Intrument at index " + i + ": " + instruments.get(i));
        }

        instruments.remove("Piano");

        for(String ins : instruments){
            System.out.println(ins);
        }

    }
}
