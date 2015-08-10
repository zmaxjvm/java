package main.gof.creational.abstractFactory.objects.orcs;

import main.gof.creational.factory.objects.Unit;

public class OrcWarrior implements Unit {

    public String unitDesignation() {
        return "Orc warrior";
    }

    public int move() {
        return 6;
    }

    public int attack() {
        return 17;
    }
}
