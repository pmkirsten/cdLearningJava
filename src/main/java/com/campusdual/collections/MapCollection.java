package com.campusdual.collections;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {

    static void main() {
        Map<String, String> instrumentsTypes = new HashMap<>();

        instrumentsTypes.put("Guitar", "String");
        instrumentsTypes.put("Piano", "String");
        instrumentsTypes.put("Drums", "Percussion");
        instrumentsTypes.put("Violin", "String");

        for(Map.Entry<String, String> entry: instrumentsTypes.entrySet()){
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        instrumentsTypes.put("Piano", "Percussion");

        System.out.println("Map after modification:");
        for(Map.Entry<String, String> entry: instrumentsTypes.entrySet()){
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        System.out.println(instrumentsTypes.containsKey("Flute"));

    }
}
