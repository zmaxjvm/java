package com.concurrency.framework.executors.cachedthreadpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by zmax.
 */
public class Server {

    private ThreadPoolExecutor executor;

    public Server() {
        executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
    }

    public void executeTask(Task task) {
        System.out.printf("Server: A new task has arrived\n");
        executor.execute(task);

        System.out.printf("Server: Pool Size: %d\n", executor.getPoolSize());
        System.out.printf("Server: Active Count: %d\n", executor.getActiveCount());
        System.out.printf("Server: Completed Tasks: %d\n", executor.getCompletedTaskCount());
    }

    public void endServer() {
        executor.shutdown();
    }

    public ThreadPoolExecutor getExecutor() {
        return executor;
    }

    public void shotdownThreadByName() {
        BlockingQueue<Runnable> blockingQueue = executor.getQueue();

    }

}
