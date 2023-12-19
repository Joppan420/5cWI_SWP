package at.test;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Animal dog = new Dog("Julian");
        dog.run();

        Animal cat = new Cat("Michi");
        cat.run();

        PetStore petStore = new PetStore();
        petStore.printNameOfAnimal(dog.getName() + " and  "  + cat.getName());

        Person person = new Person();
        person.();
    }
}
