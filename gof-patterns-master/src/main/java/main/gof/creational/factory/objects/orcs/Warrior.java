package main.gof.creational.factory.objects.orcs;

import main.gof.creational.factory.objects.Unit;

/**
 * Created by zmax.
 */
public class Warrior implements Unit {

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
