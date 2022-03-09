package com.eng.threadpool;

import java.util.concurrent.*;

public class DemoExecuter2 {

    static ConcurrentHashMap<Long, ThreadPoolExecutor> runTask = new ConcurrentHashMap<>();



    public static void main(String[] args) throws InterruptedException {

        BlockingQueue<Runnable> blockingQueue =
                new LinkedBlockingQueue<Runnable>();

        blockingQueue.offer(new DemoTask("Task Main " ));




        CustomThreadPoolExecutor executor =
                new CustomThreadPoolExecutor(1, 1, 100, TimeUnit.MILLISECONDS,
                        blockingQueue, new ThreadPoolExecutor.AbortPolicy());
        runTask.putIfAbsent(1L, executor);

        updatePostions(1L);

        for (int i = 1; i <= 100; i++) {
            blockingQueue.offer(new DemoTask("Task " + i));
        }


    }

    private static void updatePostions(Long id){
        CustomThreadPoolExecutor threadPoolExecutor = (CustomThreadPoolExecutor) runTask.get(id);
        // Let start all core threads initially
        threadPoolExecutor.prestartAllCoreThreads();
        threadPoolExecutor.shutdown();
        try {
            threadPoolExecutor.awaitTermination(1000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
