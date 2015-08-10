package com.concurrency.framework.basic.atomic;

import java.util.concurrent.TimeUnit;

/**
 * Created by zmax.
 */
public class Main {

    private static AtomicCounter atomicCounter = new AtomicCounter();
    private static final int COUNT = 10000;

    public static void main(String[] args) throws InterruptedException {

        Thread thread[] = new Thread[COUNT];
        for (int i = 0; i < COUNT; i++) {
            thread[i] = new Thread(new Task(atomicCounter), "Thread " + i);
        }

        for (int i = 0; i < COUNT; i++) {
            thread[i].start();
        }

        TimeUnit.SECONDS.sleep(1);
        System.out.println("Simple increment = " + atomicCounter.getInt());
        System.out.println("Thread safe increment = " + atomicCounter.value());
    }
}
