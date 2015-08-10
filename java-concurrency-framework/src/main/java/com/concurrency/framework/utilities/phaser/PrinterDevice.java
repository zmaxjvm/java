package com.concurrency.framework.utilities.phaser;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Created by zmax.
 */
public class PrinterDevice implements Runnable {

    private String name;
    private Random rand;

    public PrinterDevice(String name) {
        this.name = name;
        this.rand = new Random();
    }

    public void run() {
        try {
            while (true) {
                TimeUnit.SECONDS.sleep(rand.nextInt(9) + 1);
                System.out.println(name + " is empty");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
