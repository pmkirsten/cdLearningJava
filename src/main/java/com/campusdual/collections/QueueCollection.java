package com.campusdual.collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueCollection {
    static void main() {
        Queue<String> instruments = new PriorityQueue<>();

        instruments.offer("Guitar");
        instruments.offer("Piano");
        instruments.offer("Drums");
        instruments.offer("Violin");

        System.out.println("Queue of musical instruments:");
        for (String ins : instruments){
            System.out.println(ins);
        }

        String removedIntrument = instruments.poll();
        System.out.println("\nRemoved: " + removedIntrument);

        System.out.println("\nQueue after removal:");
        for (String ins : instruments){
            System.out.println(ins);
        }

        System.out.println("\nPeeked instrument is: " +instruments.peek());

        System.out.println("\nQueue after peek:");
        for (String ins : instruments){
            System.out.println(ins);
        }

    }
}
