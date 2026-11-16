package com.campusdual.exception;

public class ByZeroException extends ArithmeticException{
    public ByZeroException() {
        super();
    }

    public ByZeroException(String s) {
        super(s);
    }
}
