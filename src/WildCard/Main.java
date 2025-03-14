package WildCard;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal(1));
        animals.add(new Animal(2));

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog(1));
        dogs.add(new Dog(2));

        test(animals);
        test(dogs);

    }

    public static void test(List<? extends Animal> animals) {
        for(Animal animal: animals){
            System.out.println(animal);
        }

    }
}
