package com.campusdual.encapsulation;

public class UseOfEncapsulation {

    static void main() {
        Vehicle v1 = new Vehicle("1234BCD", "Xsara", "Citroën");
        v1.returnCar();
        v1.rentCar();
        v1.rentCar();
        v1.returnCar();
        System.out.println(v1.getDetails());
    }
}
