package main.gof.creational.abstractFactory.objects.elfs;

import main.gof.creational.factory.objects.Unit;

/**
 * Created by zmax.
 */
public class ElfArcher implements Unit {

    public String unitDesignation() {
        return "Elf archer";
    }

    public int move() {
        return 14;
    }

    public int attack() {
        return 7;
    }
}
