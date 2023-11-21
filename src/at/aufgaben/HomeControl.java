package at.aufgaben;

import java.util.ArrayList;
import java.util.List;

public class HomeControl {
    private List<Observer> observers;
    private Thermometer t1 = new Thermometer(19);
    private HeatingController h1 = new HeatingController();
    private AwningController a1 = new AwningController();

    public void startHomeControl() {
        this.observers = new ArrayList<>();
        this.observers.add(a1);
        this.observers.add(h1);
        t1.setTemperature(21);

        if (t1.getTemperature() > 20) {
            for (Observer observer : this.observers) {
                observer.inform();
            }
        }
    }

    public static void main(String[] args) {
        HomeControl hc = new HomeControl();
        hc.startHomeControl();
    }
}
