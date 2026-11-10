package com.campusdual.statics;

public class UseOfStatic {

    static void main() {
        System.out.println("Static Method: ");
        System.out.println("===============");
        System.out.println(StaticMethod.countDownToYear("John", 2120));
        System.out.println(StaticMethod.countDownToYear("Jane", 2020));
        System.out.println("\nStatic Attribute:\n==================");
        StaticAttribute sta1 = new StaticAttribute();
        StaticAttribute sta2 = new StaticAttribute();
        StaticAttribute sta3 = new StaticAttribute();

        sta1.incrementAndPrintCounter();
        sta2.incrementAndPrintCounter();
        sta1.incrementAndPrintCounter();
        sta3.incrementAndPrintCounter();
        sta2.incrementAndPrintCounter();
        sta1.incrementAndPrintCounter();
        sta1.incrementAndPrintCounter();
        sta3.incrementAndPrintCounter();
        sta2.incrementAndPrintCounter();
        sta1.incrementAndPrintCounter();
        sta2.incrementAndPrintCounter();
        sta2.incrementAndPrintCounter();
        sta3.incrementAndPrintCounter();
        sta1.incrementAndPrintCounter();
    }
}
