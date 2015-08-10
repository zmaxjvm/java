package main.gof.behaviour.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zmax.
 */
public class WeatherDataObserver implements Subject {

    private List<Observer> observers;
    private float temperature;
    private float humidity;

    public WeatherDataObserver() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity);
        }
    }

    /**
     * Set weather parameters
     * @param temperature current temperature
     * @param humidity current humidity
     */
    public void setMeasurements(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers();
    }
}
