package com.campusdual.collections;

import java.util.Stack;

public class StackCollection {

    static void main() {
        Stack<String> instruments = new Stack<>();

        instruments.push("Guitar");
        instruments.push("Piano");
        instruments.push("Drums");
        instruments.push("Violin");

        String removedIntrument = instruments.pop();
        System.out.println("\nRemoved: " + removedIntrument);


        System.out.println("\nPeeked: " + instruments.peek());

        removedIntrument = instruments.pop();
        System.out.println("\nRemoved: " + removedIntrument);


    }
}
