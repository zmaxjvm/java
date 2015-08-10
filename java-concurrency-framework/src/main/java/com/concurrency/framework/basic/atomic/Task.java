package com.concurrency.framework.basic.atomic;

/**
 * Created by zmax.
 */
public class Task implements Runnable {

    private AtomicCounter atomicCounter;

    public Task(AtomicCounter atomicCounter) {
        this.atomicCounter = atomicCounter;
    }

    @Override
    public void run() {
        atomicCounter.increment();
    }
}
