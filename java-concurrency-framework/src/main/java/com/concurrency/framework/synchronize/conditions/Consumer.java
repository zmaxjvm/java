package com.concurrency.framework.synchronize.conditions;

/**
 * Created by zmax.
 */
public class Consumer implements Runnable {

    private QueueCar q;

    Consumer(QueueCar q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    @Override
    public void run() {
        while (true) {
            q.get();
        }
    }

}
