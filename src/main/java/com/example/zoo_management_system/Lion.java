package com.example.zoo_management_system;

public class Lion extends Animal {
    public Lion(int age, String name, String type) {
        super(age, name, "Mammal");
    }

    @Override
    public void makeSound() {
        System.out.println("Roar! I'm a Lion!");
    }
}

/*
Task 3: Create Class Lion that extends Animal
Constructor: set type to "Mammal"
Override makeSound() → ""
Task 4: Create Class Parrot that extends Animal
Constructor: set type to "Bird"
Override makeSound() → "Squawk! I'm a Parrot!"

 */