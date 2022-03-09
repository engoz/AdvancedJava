package com.eng.threadpool;

import java.util.Map;
import java.util.concurrent.*;

public class DemoExecuters2 {

    private static ConcurrentHashMap<Integer,BlockingQueue<Runnable>> runTask = new ConcurrentHashMap<>();

    public static void main(String[] args) throws InterruptedException {


        for (int j = 1; j <= 3; j++) {
            for (int i = 1; i <= 10; i++) {
                updatePostions(j,i);
                runTassk();
            }
        }


    }

    private static void runTassk() {
        for (Map.Entry<Integer, BlockingQueue<Runnable>> longBlockingQueueEntry : runTask.entrySet()) {
            CustomThreadPoolExecutor threadPoolExecutor =
                    new CustomThreadPoolExecutor(1, 1, 1000, TimeUnit.MILLISECONDS,
                            longBlockingQueueEntry.getValue(), new ThreadPoolExecutor.AbortPolicy());
            threadPoolExecutor.getPoolSize();
            BlockingQueue<Runnable> queue = threadPoolExecutor.getQueue();
            threadPoolExecutor.prestartAllCoreThreads();
            threadPoolExecutor.shutdown();
            try {
                threadPoolExecutor.awaitTermination(1000, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void updatePostions(int j,int i){
        if(runTask.get(j) == null){
            runTask.put(j,new LinkedBlockingQueue<>());
        }
        runTask.get(j) .offer(new DemoTask("Main " + j +" Task - "+i));
    }
}
