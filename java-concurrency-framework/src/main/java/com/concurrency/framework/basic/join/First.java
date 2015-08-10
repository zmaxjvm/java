package com.concurrency.framework.basic.join;

import java.util.concurrent.TimeUnit;

/**
 * Created by zmax.
 */
public class First implements Runnable {

    @Override
    public void run() {
        vait();
        System.out.println("First ");
        System.out.println("First finished");
    }

    private void vait() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
