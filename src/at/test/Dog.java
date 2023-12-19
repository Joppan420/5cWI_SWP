package at.test;

public class Dog implements Animal{
    public String name;

    public Dog (String name){
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " is running");
    }

    // Implementierung der getName-Methode
    @Override
    public String getName() {
        return name;
    }
}


