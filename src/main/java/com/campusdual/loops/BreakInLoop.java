package com.campusdual.loops;

import com.campusdual.Utils;

public class BreakInLoop {
    public static void breakInLoop(){
        System.out.println("Write a 0 to stop: ");
        int number = Utils.integer("how many rabbits are there?:");
        while(true){
            if (number == 0){
                System.out.println("Almost!");
                break;
            }
            number = Utils.integer("Ah ah ah, you didn't say the magic number: ");
        }
    }

    static void main() {
        breakInLoop();
    }
}
