package main.gof.creational.abstractFactory.objects.orcs;

import main.gof.creational.factory.objects.Unit;

public class OrcArcher implements Unit {

    public String unitDesignation() {
        return "Orc archer";
    }

    public int move() {
        return 17;
    }

    public int attack() {
        return 4;
    }
}
