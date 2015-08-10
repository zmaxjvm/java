package com.concurrency.framework.collections.blocking.priority;

import java.util.concurrent.BlockingDeque;

/**
 * Created by zmax.
 */
public class Producer1 implements Runnable {

    BlockingDeque<String> queue;

    Producer1(BlockingDeque<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        System.out.println("ProducerNoBlocking1 Started 1");
        try {
            for (int i = 1; i < 10; i++) {
                queue.add("ProducerNoBlocking1 = " + i);
                System.out.println("Added: ProducerNoBlocking1 = " + i);
                Thread.currentThread().sleep(400);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
