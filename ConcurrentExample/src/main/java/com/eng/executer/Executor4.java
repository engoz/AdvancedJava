package com.eng.executer;

import java.util.concurrent.*;

/**
 * Created by enginoz on 10/23/16.
 * submit(new Future)
 */
public class Executor4 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future future = executorService.submit(new Callable() {
            @Override
            public Object call() throws Exception {
                String result = "Asynchronous Callable";
                return result;
            }
        });

        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        executorService.shutdown();
    }
}
