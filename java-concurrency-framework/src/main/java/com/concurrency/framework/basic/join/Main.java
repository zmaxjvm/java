package com.concurrency.framework.basic.join;

import java.util.Date;

/**
 * Created by zmax.
 */
public class Main {

    public static void main(String[] args) {

        System.out.printf("Join started %s\n", new Date());

        First first = new First();
        Second second = new Second();
        Thread thread1 = new Thread(first, "DataSourceThread");
        thread1.setPriority(Thread.MAX_PRIORITY);
        Thread thread2 = new Thread(second, "NetworkConnectionLoader");
        thread2.setPriority(Thread.MIN_PRIORITY);

        thread1.start();
        thread2.start();

//Wait for the finalization of both threads using the join() method.
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("Join completed: %s\n", new Date());
    }
}
