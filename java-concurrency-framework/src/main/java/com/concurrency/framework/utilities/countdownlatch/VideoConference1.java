package com.concurrency.framework.utilities.countdownlatch;

/**
 * Created by zmax.
 */
public class VideoConference1 extends VideoConference {

    public VideoConference1(int number) {
        super(number);
    }

    @Override
    public void run() {
        System.out.printf("VideoConference 1: Initialization: %d participants.\n", countDownLatch.getCount());
        try {
            countDownLatch.await();
            System.out.printf("VideoConference 1: All the participants have come\n");
            System.out.printf("VideoConference 1: Let's start...\n");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
