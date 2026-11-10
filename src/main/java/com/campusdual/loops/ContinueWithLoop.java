package com.campusdual.loops;

import com.campusdual.Utils;

public class ContinueWithLoop {
     public static void continueExample(){
         int num = Utils.integer("Write a number: ");
         for (int i = 1; i <= num ; i++){
             if (i % 2 != 0){
                 continue;
             }
             System.out.println(i + " / 2 = " + (i/2));
         }
     }

    static void main() {
        continueExample();
    }
}
