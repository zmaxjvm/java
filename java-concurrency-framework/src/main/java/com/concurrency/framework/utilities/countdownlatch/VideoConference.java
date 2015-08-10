package com.concurrency.framework.utilities.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * Created by zmax.
 */
public class VideoConference implements Runnable {

    protected final CountDownLatch countDownLatch;

    public VideoConference(int number) {
        countDownLatch = new CountDownLatch(number);
    }

    public void arrive(String name) {
        System.out.printf("%s has arrived.", name);
        countDownLatch.countDown();

        System.out.printf(" -> VideoConference: Waiting for %d participants.\n", countDownLatch.getCount());
    }

    @Override
    public void run() {
        System.out.printf("VideoConference: Initialization: %d participants.\n", countDownLatch.getCount());
        try {
            countDownLatch.await();
            System.out.printf("VideoConference: All the participants have come\n");
            System.out.printf("VideoConference: Let's start...\n");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
