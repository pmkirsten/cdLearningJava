package com.campusdual.loops;

import com.campusdual.Utils;

public class InfiniteLoop {

    public static void infiniteLoop(){
        System.out.println("Write a 0 to stop: ");
        int number = Utils.integer("how many rabbits are there?:");
        while(true){
            System.out.println("Ah ah ah, you didn't say the magic word!");
        }
    }

    static void main() {
        infiniteLoop();
    }
}
