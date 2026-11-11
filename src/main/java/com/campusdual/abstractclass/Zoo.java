package com.campusdual.abstractclass;

public class Zoo {
    static void main() {
        // Animal a = new Animal("Cat"); // Not working
        Cat c = new Cat("Cat");
        Fox f = new Fox("Fox");
        AngoraCat a = new AngoraCat("Angora Cat");

        c.sleep();
        f.sleep();
        a.sleep();

        c.wakeUp();
        f.wakeUp();
        a.wakeUp();

        c.makeSound();
        f.makeSound();
        a.makeSound();
    }
}
