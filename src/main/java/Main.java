import com.example.zoo_management_system.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Animal animal1 = new Animal(10, "Kowalski", "Penguin" );
//        Animal animal2 = new Animal(8, "Private", "Penguin");
//        Animal animal3 = new Animal(9, "Skipper", "Penguin");
//        Animal animal4 = new Animal(12, "Rico", "Penguin");
//        Animal animal5 = new Animal(13, "Gloria", "Hippo");
//        Animal animal6 = new Animal(14, "Melman", "Giraffe");

        Zoo zoo = new Zoo();

        Animal animal1 = new Lion(5, "Bagheera", "Black panther");
        Animal animal2 = new Lion(7, "Sher Khan", "Bengal tiger");
        Animal animal3 = new Parrot(9, "Iago", "scarlet macaw");
        Animal animal4 = new Parrot(8, "Rio", "Spix's macaw");
        Animal animal5 = new Elephant(22, "Mrs. Jumbo", "small Asian elephant");

        zoo.addAnimal(animal1);
        zoo.addAnimal(animal2);
        zoo.addAnimal(animal3);
        zoo.addAnimal(animal4);
        zoo.addAnimal(animal5);

        zoo.showAllAnimals();
        System.out.println();
        zoo.simulateAnimalSounds();
        System.out.println();
        zoo.feedAllAnimals();
    }
}
