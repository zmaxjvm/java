package main.gof.behaviour.strategy;

/**
 * Created by zmax.
 */
public class Taxi implements Transport {
    public void move() {
        System.out.println("Travel by taxi");
    }
}
