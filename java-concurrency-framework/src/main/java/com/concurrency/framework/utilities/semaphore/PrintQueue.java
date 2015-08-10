package com.concurrency.framework.utilities.semaphore;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * Created by zmax.
 */
public class PrintQueue {

    private final Semaphore semaphore;


    public PrintQueue(int countPrints) {
        semaphore = new Semaphore(countPrints);
    }

    public void printJob(Object document) {

        try {
            semaphore.acquire();

            long duration = (long) (Math.random() * 5) + 1;
            System.out.printf("%s: PrintQueue: Printing a Job during %d seconds\n", Thread.currentThread().getName(), duration);

            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }

    }

}
