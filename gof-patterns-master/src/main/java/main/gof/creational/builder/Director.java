package main.gof.creational.builder;

import main.gof.creational.builder.buildersabstracts.AbstractLaptopBuilder;
import main.gof.creational.builder.items.Laptop;

/**
 * Created by zmax.
 * Class provide to build object.
 * Class get abstract laptop and provide build object
 */
public class Director {
    private AbstractLaptopBuilder laptopBuilder;

    /**
     * Set builder implementation for build entire object in parts.
     *
     * @param laptopBuilder
     */
    public void setLaptopBuilder(AbstractLaptopBuilder laptopBuilder) {
        this.laptopBuilder = laptopBuilder;
    }

    /**
     * Build concrete object instance
     */
    public void constructLaptop() {
        laptopBuilder.createNewLaptop();
        laptopBuilder.buildDisplay();
        laptopBuilder.buildCentralProcessor();
        laptopBuilder.buildVideoAdapter();
    }

    public Laptop getLaptop() {
        return laptopBuilder.getLaptop();
    }
}
