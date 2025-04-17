package com.example.zoo_management_system;

import java.util.ArrayList;

public class Zoo {
    //Maintain a List<Animal> called animalList
    static ArrayList<Animal> animalList = new ArrayList<>();

    //Add method addAnimal(Animal animal)
    public static void addAnimal(Animal animal){
        animalList.add(animal);
    }

    //Add method showAllAnimals() to print name + type of each animal
    public void showAllAnimals() {
        System.out.println("Zoo Animals:");
        for (Animal animal : animalList) {
            System.out.println("- " + animal.getName() + " ( " +  animal.getType() + " )");
        }
    }

    public void simulateAnimalSounds(){
        System.out.println("Animal Sounds:");
        for (Animal animal : animalList) {
            animal.makeSound();
        }
    }

    public void feedAllAnimals(){
        for (Animal animal : animalList) {
            System.out.println("Feeding " + animal.getName() + " food");
        }
    }


}