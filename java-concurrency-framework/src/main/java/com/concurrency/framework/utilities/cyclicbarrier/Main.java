package com.concurrency.framework.utilities.cyclicbarrier;

/**
 * Created by zmax.
 */
public class Main {

    public static void main(String args[]) {
        ServiceMan serviceMan = new ServiceMan(3);

        for (int i = 0; i < 6; i++) {
            new Thread(new Printer(serviceMan, "PrinterDevice" + (i + 1))).start();
        }
    }
}
