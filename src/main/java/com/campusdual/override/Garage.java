package com.campusdual.override;

public class Garage {
    static void main() {
        Vehicle v = new Vehicle();
        Car c = new Car();
        Tractor t = new Tractor();

        v.start();
        c.start();
        t.start();
    }
}
