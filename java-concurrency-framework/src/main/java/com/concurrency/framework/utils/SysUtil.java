package com.concurrency.framework.utils;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Created by zmax.
 */
public class SysUtil {

    private static final Random rand = new Random();

    public static final void sleepRandom(int minSleep, int maxSleep) {
        try {
            TimeUnit.SECONDS.sleep(rand.nextInt(maxSleep) + minSleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static final void sleep(int sec) {
        try {
            TimeUnit.SECONDS.sleep(sec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
