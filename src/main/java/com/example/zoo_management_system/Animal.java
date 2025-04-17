package com.example.zoo_management_system;

public class Animal {

    //Task 1: Create the Base Class Animal
    //Properties (all private):
    //name (String)
    //age (int)
    //type (String – e.g. "Mammal", "Bird")

    private String name;
    private int age;
    private String type;


    //Encapsulate with:
    //getName(), getAge(), getType()
    //setAge() with validation (must be > 0)

    //Getters

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getType() {
        return type;
    }

    //Constructors
    public Animal(){};

    public Animal(int age, String name, String type) {
        this.age = age;
        this.name = name;
        this.type = type;
    }

    //Setter with validation
    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Incorrect age");
        } else {
            this.age = age;
        }
    }
    //Method: makeSound() – just System.out.println("Some generic animal sound")
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }

}

