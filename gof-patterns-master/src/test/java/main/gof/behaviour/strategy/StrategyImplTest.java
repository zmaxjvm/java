package main.gof.behaviour.strategy;

import org.junit.Test;

public class StrategyImplTest {

    @Test
    public void travelTest() {

        Car car = new Car();
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        StrategyImpl strategyImpl = new StrategyImpl(car);
        strategyImpl.travel();
        strategyImpl.changeTransport(bus);
        strategyImpl.travel();

        strategyImpl.changeTransport(taxi);
        strategyImpl.travel();
    }
}
