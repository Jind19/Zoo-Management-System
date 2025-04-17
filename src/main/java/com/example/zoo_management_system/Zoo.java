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
        for (Animal animal : animalList) {
            System.out.println("Its a " + animal.getName() + " and it's " +  animal.getType());
        }
    }

}