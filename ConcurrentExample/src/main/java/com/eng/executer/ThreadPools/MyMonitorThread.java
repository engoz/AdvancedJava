package com.eng.executer.ThreadPools;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by enginoz on 10/23/16.
 */
public class MyMonitorThread implements Runnable {

    ThreadPoolExecutor executor;
    private int seconds;
    private boolean run = true;

    public MyMonitorThread(ThreadPoolExecutor executor, int delay){
        this.executor = executor;
        this.seconds = delay;
    }

    public void shutdown(){
        this.run = false;
    }


    public void run() {
        while(run){
            System.out.println(
                    String.format("[monitor] [%d/%d], Active: %d, Completed: %d, Task: %d, isShutdown: %s, isTerminated: %s",
                            this.executor.getPoolSize(),
                            this.executor.getCorePoolSize(),
                            this.executor.getActiveCount(),
                            this.executor.getCompletedTaskCount(),
                            this.executor.getTaskCount(),
                            this.executor.isShutdown(),
                            this.executor.isTerminated()));
            try {
                Thread.sleep(seconds*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
