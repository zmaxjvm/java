package main.gof.creational.abstractFactory;

import main.gof.creational.abstractFactory.objects.orcs.OrcArcher;
import main.gof.creational.abstractFactory.objects.orcs.OrcFighter;
import main.gof.creational.abstractFactory.objects.orcs.OrcWarrior;
import main.gof.creational.factory.objects.Unit;

/**
 * Factory for create units
 */
public class FactoryOrcs implements GamesElementsFactory {

    /**
     * Create orc fighter
     *
     * @return unit fighter
     */
    public Unit makeFighter() {
        return new OrcFighter();
    }

    /**
     * Create orc warrior
     *
     * @return unit warrior
     */
    public Unit makeWarrior() {
        return new OrcWarrior();
    }

    /**
     * Create orc archer
     *
     * @return unit archer
     */
    public Unit makeArcher() {
        return new OrcArcher();
    }
}


