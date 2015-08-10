package com.concurrency.framework.synchronize.bloclock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by zmax.
 */
public class PrintQueue {

    private final Lock queueLock = new ReentrantLock();

    public void printJob(Object document) {
        //sleep if block of code busy by another thread
        queueLock.lock();
        try {
            Long duration = (long) (Math.random() * 10);
            System.out.println(Thread.currentThread().getName() + ":PrintQueue: Printing a Job during " + duration + " seconds");
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            queueLock.unlock();
        }
    }

}
