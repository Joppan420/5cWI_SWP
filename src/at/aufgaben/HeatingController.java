package at.aufgaben;

public class HeatingController implements Observer{
    public HeatingController(){

    }

    @Override
    public void inform(){
        System.out.println("Info for HeatingController");
    }
}
