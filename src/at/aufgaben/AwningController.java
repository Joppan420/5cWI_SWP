package at.aufgaben;

public class AwningController implements  Observer {
    public AwningController(){

    }

    @Override
    public void inform() {
        System.out.println("Info for AwningControler");
    }
}
