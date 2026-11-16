package com.campusdual.exception;

public class Exceptions {

    public static int divisionByNumber(int a, int b) throws ByZeroException {
        if (b == 0){
            throw new ByZeroException("Division by zero");
        }

        return a / b;

    }

    static void main() {
//        int dividend = 3;
//        int divisor = 0;
//        int res = dividend / divisor;
//        System.out.println(res);
//        String greetings = "Hello there!";
//        System.out.println(Integer.parseInt(greetings));

        int dividend = 3, divisor = 0;
        try {
            int res = Exceptions.divisionByNumber(dividend, divisor);
            System.out.println(res);
        } catch (ByZeroException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Program finished!");
        }
    }
}
