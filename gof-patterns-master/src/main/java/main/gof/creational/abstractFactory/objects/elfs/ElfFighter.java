package main.gof.creational.abstractFactory.objects.elfs;

import main.gof.creational.factory.objects.Unit;

/**
 * Created by zmax.
 */
public class ElfFighter implements Unit {

    public String unitDesignation() {
        return "Elf fighter";
    }

    public int move() {
        return 14;
    }

    public int attack() {
        return 19;
    }
}
