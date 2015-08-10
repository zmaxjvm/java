package main.gof.creational.factory;


import main.gof.creational.factory.objects.*;
import main.gof.creational.factory.objects.orcs.Archer;
import main.gof.creational.factory.objects.orcs.Fighter;
import main.gof.creational.factory.objects.orcs.Warrior;

/**
 * Created by zmax.
 *
 * Factory for create units
 */
public class FactoryOrcs {

    /**
     * Create orc fighter
     *
     * @return unit fighter
     */
    public Unit makeFighter() {
        return new Fighter();
    }

    /**
     * Create orc warrior
     *
     * @return unit warrior
     */
    public Unit makeWarrior() {
        return new Warrior();
    }

    /**
     * Create orc archer
     *
     * @return unot archer
     */
    public Unit makeArcher() {
        return new Archer();
    }
}


