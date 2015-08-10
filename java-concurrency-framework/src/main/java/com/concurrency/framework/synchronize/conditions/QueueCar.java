package com.concurrency.framework.synchronize.conditions;

import java.util.concurrent.TimeUnit;

/**
 * Created by zmax.
 */
public class QueueCar {
    private int n;
    private Status status = Status.PREPARATION;

    synchronized int get() {
        sleep();

        if (status == Status.PREPARATION) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        }
        System.out.println("Got car: " + n);
        status = Status.PREPARATION;
        notify();
        return n;
    }

    synchronized void put(int n) {
        sleep();

        if (status == Status.READY) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        }
        this.n = n;
        System.out.println("Put car: " + n);

        status = Status.READY;
        notify();
    }

    private void sleep() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
