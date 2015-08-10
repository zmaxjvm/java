package main.gof.creational.builder.buildersabstracts;

import main.gof.creational.builder.items.Laptop;

/**
 * Created by zmax.
 */
public abstract class AbstractLaptopBuilder {
    protected Laptop laptop;

    public Laptop getLaptop() {
        return laptop;
    }

    public void createNewLaptop() {
        laptop = new Laptop();
    }

    public abstract void buildCentralProcessor();

    public abstract void buildDisplay();

    public abstract void buildVideoAdapter();
}
