package com.concurrency.framework.collections.blocking.priority;

import java.util.concurrent.BlockingDeque;

/**
 * Created by zmax.
 */
public class Producer2 implements Runnable {

    BlockingDeque<String> queue;

    Producer2(BlockingDeque<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        System.out.println("ProducerNoBlocking1 Started 1");
        try {
            for (int i = 1; i < 10; i++) {
                queue.add("ProducerNoBlocking2 = " + i);
                System.out.println("Added: ProducerNoBlocking2 = " + i);
                Thread.currentThread().sleep(800);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
