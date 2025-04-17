import com.example.zoo_management_system.Animal;
import com.example.zoo_management_system.Zoo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal(10, "Kowalski", "Penguin" );
        Animal animal2 = new Animal(8, "Private", "Penguin");
        Animal animal3 = new Animal(9, "Skipper", "Penguin");
        Animal animal4 = new Animal(12, "Rico", "Penguin");
        Animal animal5 = new Animal(13, "Gloria", "Hippo");
        Animal animal6 = new Animal(14, "Melman", "Giraffe");
        Zoo zoo = new Zoo();
        zoo.addAnimal(animal1);
        zoo.addAnimal(animal2);
        zoo.addAnimal(animal3);
        zoo.addAnimal(animal4);
        zoo.showAllAnimals();
    }
}
