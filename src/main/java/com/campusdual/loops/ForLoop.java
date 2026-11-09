package com.campusdual.loops;

import com.campusdual.Utils;

public class ForLoop {

    public static void countEvenNumbers(){
        int initialValue = Utils.integer("Write your start number: ");
        int finalValue = Utils.integer("Write your final number: ");
        int count = 0;

        for (int i = initialValue; i <= finalValue; i++){
            if (i % 2 == 0){
                count++;
            }
        }

        System.out.println("There are " + count + " even numbers between " + initialValue + " and " + finalValue);

    }

    static void main() {
        countEvenNumbers();
    }
}
