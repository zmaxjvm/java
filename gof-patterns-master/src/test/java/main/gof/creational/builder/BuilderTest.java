package main.gof.creational.builder;

import junit.framework.Assert;
import main.gof.creational.builder.buildersabstracts.AbstractLaptopBuilder;
import main.gof.creational.builder.buildersimpl.CheapLaptopBuilder;
import main.gof.creational.builder.items.Laptop;
import org.junit.Test;

public class BuilderTest {

    @Test
    public void testBuildProcess() {
        Director director = new Director();
        AbstractLaptopBuilder cheapLaptopBuilder = new CheapLaptopBuilder();

        director.setLaptopBuilder(cheapLaptopBuilder);
        director.constructLaptop();
        Laptop laptop = director.getLaptop();

        Assert.assertTrue(laptop.getProcessor().equals("AMD"));
        Assert.assertTrue(laptop.getDisplay().equals("CRT"));
        Assert.assertTrue(laptop.getVideoAdapter().equals("integrated"));

        String laptopDisplay = laptop.getDisplay();
        String laptopProcessor = laptop.getProcessor();
        String laptopVideoAdapter = laptop.getVideoAdapter();

        System.out.println("Laptop display = " + laptopDisplay);
        System.out.println("Laptop processor = " + laptopProcessor);
        System.out.println("Laptop video adapter = " + laptopVideoAdapter);
    }
}
