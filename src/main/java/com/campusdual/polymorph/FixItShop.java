package com.campusdual.polymorph;

public class FixItShop {
    static void main() {
        Device s1 = new Smartphone("Poco", "X4");
        Device t1 = new Tablet("Xiaomi", "Pad 6");
        Device l1 = new Laptop("Lenovo", "L380");

        IChargeable s2 = new Smartphone("Realme", "Neo GT2");
        IChargeable t2 = new Tablet("Samsung", "Galaxy Tab S9+");
        IChargeable l2 = new Laptop("Dell", "Latitude 5520");

        Device s3 = new Smartphone("Xiaomi", "11 Lite");
        IChargeable t3 = new Tablet("iPad", "Mini 2");
        Device l3 = new Laptop("Lenovo", "20RR");

        s1.turnOn();
        t1.turnOn();
        l1.turnOn();
        s1.turnOff();
        t1.turnOff();
        l1.turnOff();

        s2.charge();
        t2.charge();
        l2.charge();
        s2.use();
        t2.use();
        l2.use();

        ((Smartphone)s3).makeACall();
        ((Device)t3).turnOn();
        ((IChargeable)l3).use();


    }
}

