package main.gof.creational.builder.buildersimpl;

import main.gof.creational.builder.buildersabstracts.AbstractLaptopBuilder;

/**
 * Created by zmax.
 */
public class ExpensiveLaptopBuilder extends AbstractLaptopBuilder {

    public void buildCentralProcessor() {
        laptop.setProcessor("Intel");
    }

    public void buildDisplay() {
        laptop.setDisplay("CRT 7");
    }

    public void buildVideoAdapter() {
        laptop.setVideoAdapter("NVIDIA");
    }
}
