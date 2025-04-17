package com.example.zoo_management_system;

public class Elephant extends Animal{

    public Elephant(int age, String name, String type) {
        super(age, name, "Mammal");
    }

    @Override
    public void makeSound() {
        System.out.println("Trumpet! I'm an Elephant!");
    }

}
