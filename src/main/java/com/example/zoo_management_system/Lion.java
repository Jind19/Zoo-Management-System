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
