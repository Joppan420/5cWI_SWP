package at.test;

public class Cat implements Animal {
    private String name;

    public Cat (String name){
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
