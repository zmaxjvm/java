package main.gof.behaviour.observer.displays;

import main.gof.behaviour.observer.Observer;
import main.gof.behaviour.observer.Subject;

public class ConditionsDisplay implements Observer {

    private float temperature;
    private float humidity;

    public ConditionsDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Condition display: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
