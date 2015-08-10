package com.concurrency.framework.utilities.countdownlatch;

/**
 * Created by zmax.
 */
public class Main {

    public static void main(String[] args) {

        VideoConference conference = new VideoConference(10);

        Thread thread = new Thread(conference);
        thread.start();

        for (int i = 0; i < 10; i++) {
            Participant p = new Participant(conference, " Participant " + i);
            Thread t = new Thread(p);
            t.start();
        }
    }

}
