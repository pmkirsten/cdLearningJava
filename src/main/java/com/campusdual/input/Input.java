package com.campusdual.input;

import com.campusdual.Utils;

import java.util.Scanner;

public class Input {

    public static void useScannerToGetName(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello," + name);
    }

    public static void useUtilsToGetName(){
        String name = Utils.string("Write your name: ");
        System.out.println("Hello," + name);
    }


    public static int writeNumber(){
        int number = Utils.integer("Write your number: ");
        return number;
    }

    static void main() {
        useScannerToGetName();
        useUtilsToGetName();
//        System.out.println(writeNumber());
    }



}
