package com.concurrency.framework.executors.execute;

/**
 * Created by zmax.
 */
public class Main {

    public static final int COUNT = 5;

    private static final SpaceLauncher SPACE_LAUNCHER = new SpaceLauncher();

    public static void main(String[] args) {

        for (int i = 0; i < COUNT; i++) {
            Airfield airfield = new Airfield("Ship №" + i);
            SPACE_LAUNCHER.executeTask(airfield);
        }

        SPACE_LAUNCHER.endServer();
    }

}
