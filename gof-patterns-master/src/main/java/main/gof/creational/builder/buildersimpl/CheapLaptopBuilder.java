package main.gof.creational.builder.buildersimpl;

import main.gof.creational.builder.buildersabstracts.AbstractLaptopBuilder;

/**
 * Created by zmax.
 */
public class CheapLaptopBuilder extends AbstractLaptopBuilder {

    public void buildCentralProcessor() {
        laptop.setProcessor("AMD");
    }

    public void buildDisplay() {
        laptop.setDisplay("CRT");
    }

    public void buildVideoAdapter() {
        laptop.setVideoAdapter("integrated");
    }
}
