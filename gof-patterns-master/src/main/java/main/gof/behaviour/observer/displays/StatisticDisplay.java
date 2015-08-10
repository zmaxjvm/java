package main.gof.behaviour.observer.displays;

import main.gof.behaviour.observer.Observer;
import main.gof.behaviour.observer.Subject;

public class StatisticDisplay implements Observer {

    private float temperature;
    private float humidity;

    public StatisticDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }


    public void update(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Statistic display: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
