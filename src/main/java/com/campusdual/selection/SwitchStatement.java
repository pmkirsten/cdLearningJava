package com.campusdual.selection;

public class SwitchStatement {

    public static int methodSwitchCase(int value){
        int toRet = 0;
        switch (value + 1){
            case 1:
                toRet = 11;
                break;
            case 2:
                toRet = 22;
                break;
            case 3:
                toRet = 33;
                break;
            default:
        }

        return toRet;
    }

    static void main() {
        int initialValue= 1;
        int value = methodSwitchCase(initialValue);
        System.out.println("Initial value is → " + initialValue + ", final value is → " + value);
    }
}
