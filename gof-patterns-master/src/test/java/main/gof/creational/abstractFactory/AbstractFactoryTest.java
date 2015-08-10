package main.gof.creational.abstractFactory;

import main.gof.creational.abstractFactory.objects.elfs.ElfArcher;
import main.gof.creational.abstractFactory.objects.orcs.OrcFighter;
import main.gof.creational.factory.objects.Unit;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AbstractFactoryTest {

    @Test
    public void factoryOrcsTest() {
        GamesElementsFactory factoryOrcs = new FactoryOrcs();
        GamesElementsFactory factoryElfs = new FactoryElfs();

        assertTrue(factoryOrcs.makeFighter() instanceof OrcFighter);
        assertTrue(factoryElfs.makeArcher() instanceof ElfArcher);

        Unit orcFighter = factoryOrcs.makeFighter();
        Unit elfFighter = factoryElfs.makeFighter();

        String fighterOrcDescription = orcFighter.unitDesignation();
        String fighterElfDescription = elfFighter.unitDesignation();

        System.out.println(fighterOrcDescription);
        System.out.println(fighterElfDescription);
    }
}
