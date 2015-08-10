package main.gof.creational.factory;

import main.gof.creational.factory.objects.orcs.Archer;
import main.gof.creational.factory.objects.Unit;
import main.gof.creational.factory.objects.orcs.Fighter;
import main.gof.creational.factory.objects.orcs.Warrior;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FactoryOrcsTest {

    @Test
    public void factoryOrcsTest() {
        FactoryOrcs factoryOrcs = new FactoryOrcs();

        assertTrue(factoryOrcs.makeFighter() instanceof Fighter);
        assertTrue(factoryOrcs.makeWarrior() instanceof Warrior);
        assertTrue(factoryOrcs.makeArcher() instanceof Archer);

        Unit orcFighter = factoryOrcs.makeFighter();
        Unit orcWarrior = factoryOrcs.makeWarrior();
        Unit orcArcher = factoryOrcs.makeArcher();

        String fighterDescription = orcFighter.unitDesignation();
        String warriorDescription = orcWarrior.unitDesignation();
        String archerDescription = orcArcher.unitDesignation();

        System.out.println(fighterDescription);
        System.out.println(warriorDescription);
        System.out.println(archerDescription);
    }

}
