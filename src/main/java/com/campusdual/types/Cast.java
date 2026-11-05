package com.campusdual.types;

public class Cast {

    static void main() {
        int originalInt = 200;
        originalInt = originalInt + 2;
        System.out.println(originalInt);

        String originalString = "My number is: ";
        System.out.println(originalString);

        originalString = originalString + 2;
        System.out.println(originalString);

        originalString = 2 + originalString;
        System.out.println(originalString);

        String parsedInt = String.valueOf(originalInt);
        System.out.println(parsedInt);

        parsedInt = parsedInt + 2;
        System.out.println(parsedInt);

        Integer finalString = Integer.parseInt(parsedInt);
        System.out.println(finalString);
        System.out.println(finalString+2);

        boolean bool = true;
        String strBool = String.valueOf(bool);
        System.out.println(strBool);

        byte value = 125;
        byte valueSum = 9;
        byte result = (byte) (value + valueSum);
        System.out.println(result);
    }
}
