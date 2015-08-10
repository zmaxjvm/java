package main.gof.creational.factory.objects.orcs;

import main.gof.creational.factory.objects.Unit;

/**
 * Created by zmax.
 */
public class Fighter implements Unit {

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
