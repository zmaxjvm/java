package main.gof.creational.abstractFactory.objects.orcs;

import main.gof.creational.factory.objects.Unit;

public class OrcFighter implements Unit {

    public String unitDesignation() {
        return "Orc fighter";
    }

    public int move() {
        return 10;
    }

    public int attack() {
        return 12;
    }
}
