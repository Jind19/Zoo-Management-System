package com.example.zoo_management_system;

public class Parrot extends Animal {
    public Parrot(int age, String name, String type) {
        super(age, name, "Bird");
    }

    @Override
    public void makeSound() {
        System.out.println("Squawk! I'm a Parrot!");
    }
}
