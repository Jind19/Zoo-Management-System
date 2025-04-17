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

 /*
Task 4: Create Class Parrot that extends Animal
Constructor: set type to "Bird"
Override makeSound() → "Squawk! I'm a Parrot!"

 */