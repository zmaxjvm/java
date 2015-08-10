package com.concurrency.framework.executors.execute;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by zmax.
 */
public class SpaceLauncher {

    private ThreadPoolExecutor executor;

    public SpaceLauncher() {
        executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(Main.COUNT);
    }

    public void executeTask(Airfield airfield) {
        System.out.printf("New ship has arrived\n");
        executor.execute(airfield);
    }

    public void endServer() {
        executor.shutdown();
    }

}
