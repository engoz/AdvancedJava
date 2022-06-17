package com.eng.threadpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CustomThreadPoolExecutor extends ThreadPoolExecutor {

    BlockingQueue<Runnable> workQueue;

    public CustomThreadPoolExecutor(int corePoolSize, int maximumPoolSize,
                                    long keepAliveTime, TimeUnit unit,
                                    BlockingQueue<Runnable> workQueue, RejectedExecutionHandler handler) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue,handler);
        this.workQueue = workQueue;
    }

    @Override
    protected void beforeExecute(Thread t, Runnable r) {
        super.beforeExecute(t, r);
        System.out.println();
        System.out.println("Before Queue Sizes " + workQueue.size());
        System.out.println("Perform beforeExecute() logic");
    }

    @Override
    protected void afterExecute(Runnable r, Throwable t) {
        super.afterExecute(r, t);
        if (t != null) {
            System.out.println("Perform exception handler logic");
        }
        System.out.println("After Queue Sizes " + workQueue.size());
        System.out.println("Perform afterExecute() logic");
    }
}

