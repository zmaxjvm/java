package com.concurrency.framework.executors.cachedthreadpool;

/**
 * Created by zmax.
 */
public class Main {

    private static final String threadName = "PeriodicallyTask";

    public static void main(String[] args) throws InterruptedException {

        Server server = new Server();
        for (int i = 0; i < 10; i++) {
            Task task = new Task(threadName + i);
            server.executeTask(task);
        }
        server.shotdownThreadByName();
        server.endServer();
    }

}
