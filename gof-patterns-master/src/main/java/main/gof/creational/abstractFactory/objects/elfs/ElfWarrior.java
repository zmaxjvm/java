package main.gof.creational.abstractFactory.objects.elfs;

import main.gof.creational.factory.objects.Unit;

/**
 * Created by zmax.
 */
public class ElfWarrior implements Unit {

    public String unitDesignation() {
        return "Elf warrior";
    }

    public int move() {
        return 9;
    }

    public int attack() {
        return 13;
    }
}
