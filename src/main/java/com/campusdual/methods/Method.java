package com.campusdual.methods;

public class Method {

    public static void logicOperators() {
        System.out.println("4 is equal to 4: " + (4==4));
        System.out.println("3 is different from 4: " + (3 != 4));
        System.out.println("3 is greater than 5: " + (3 > 5));
        System.out.println("5 is less than or equal to 5: " + (5 <= 5));
        System.out.println("Unique true combination for AND: " + (true && true));
        System.out.println("Unique false combination for OR: " + (false || false));
        System.out.println("NOT false: " + (!false));
    }

    public static int aritmethicOperators(){
        int value = 5;
        value = value + 3;
        value = 2 - value;
        value += 3;
        value -= 1;
        value *= 4;
        value = (value - 2) / 2 ;
        int newValue = 3;
        int myValue = 2;
        value = newValue + myValue;
        final int CONST = 2;
        value = CONST;
        value += 3;
        value = value % 2;
        value++;
        value--;
        return value;
    }

    public static String myCustomMessage(String customName, String anotherValue){
        return "Hi "+ customName +"! This is my custom message from " + anotherValue;
    }

    static void main() {
        logicOperators();
        int aritOp = aritmethicOperators();
        System.out.println("Aritmetic result: "+ aritOp);
        String name = "Pablo";
        String name2 = "Gumersindo";
        String message = myCustomMessage(name, name2);
        System.out.println(message);
    }

}
