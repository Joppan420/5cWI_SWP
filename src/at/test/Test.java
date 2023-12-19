package at.test;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("Hans", "Mayer");


        PetStore petStore = new PetStore(person);

        Cat cat =  new Cat("hansi");
        System.out.println(cat.getName());
        petStore.addAnimals(cat);


        Dog dog =  new Dog("Max");
        System.out.println(dog.getName());
        petStore.addAnimals(dog);

        petStore.printNameOfAnimal();
        petStore.getOwner();

    }
}
