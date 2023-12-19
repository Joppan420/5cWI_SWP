package at.test;

public class Person {
    private static void firstName(String fistName){
        System.out.println(fistName);
    }

    private static void lastName(String lastName){
        System.out.println(lastName);
    }



    public void printName(){
        System.out.println(firstName + lastName);
    }
}
