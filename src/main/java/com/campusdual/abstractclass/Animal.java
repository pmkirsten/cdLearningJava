package com.campusdual.abstractclass;

public abstract class Animal {
    private String animalName;

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public abstract void makeSound();

    public void sleep(){
        System.out.println(this.animalName + " is sleeping");
    }

    public void wakeUp(){
        System.out.println(this.animalName + " is awake");
    }
}
