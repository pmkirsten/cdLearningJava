package com.campusdual.interfaces;

public class ArgumentExample {

    public static void arguments(String... args){
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

    static void main() {
        ArgumentExample.arguments("argumento1", "mi otro argumento");
    }
}
