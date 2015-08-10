package com.concurrency.framework.utilities.countdownlatch;

import java.util.concurrent.TimeUnit;

/**
 * Created by zmax.
 */
public class Participant implements Runnable {

    private VideoConference videoConference;

    private String name;

    public Participant(VideoConference conference, String name) {
        this.videoConference = conference;
        this.name = name;
    }

    @Override
    public void run() {
        sleep();
        //some code ...
        videoConference.arrive(name);
    }

    private void sleep() {
        long duration = (long) (Math.random() * 10);
        try {
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
