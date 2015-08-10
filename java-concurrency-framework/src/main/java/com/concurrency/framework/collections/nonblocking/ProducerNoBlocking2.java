package com.concurrency.framework.collections.nonblocking;

import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * Created by zmax.
 */
public class ProducerNoBlocking2 implements Runnable {

    ConcurrentLinkedDeque<String> queue;

    ProducerNoBlocking2(ConcurrentLinkedDeque<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        System.out.println("ProducerNoBlocking1 Started 1");

        for (int i = 1; i < 10; i++) {
            queue.add("ProducerNoBlocking2 = " + i);
            System.out.println("Added: ProducerNoBlocking2 = " + i);

            try {
                Thread.currentThread().sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
