package main.gof.behaviour.observer;

import main.gof.behaviour.observer.displays.ConditionsDisplay;
import main.gof.behaviour.observer.displays.StatisticDisplay;
import org.junit.Test;

public class WeatherDataObserverTest {

    @Test
    public void observerTest() {
        WeatherDataObserver weatherDataObserver = new WeatherDataObserver();

        ConditionsDisplay conditionsDisplay = new ConditionsDisplay(weatherDataObserver);
        StatisticDisplay statisticDisplay = new StatisticDisplay(weatherDataObserver);

        weatherDataObserver.setMeasurements(30, 65);
        weatherDataObserver.setMeasurements(22, 65);
        weatherDataObserver.setMeasurements(21, 65);
        weatherDataObserver.setMeasurements(19, 69);

        weatherDataObserver.removeObserver(conditionsDisplay);

        weatherDataObserver.setMeasurements(14, 43);
        weatherDataObserver.setMeasurements(12, 32);
        weatherDataObserver.setMeasurements(10, 29);
        weatherDataObserver.registerObserver(conditionsDisplay);
        weatherDataObserver.removeObserver(statisticDisplay);
        weatherDataObserver.setMeasurements(40, 77);

    }
}
