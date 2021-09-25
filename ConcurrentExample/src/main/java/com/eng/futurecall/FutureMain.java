package com.eng.futurecall;

/**
 * Created by enginoz on 10/15/16.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureMain {
    private static final ExecutorService threadpool = Executors.newFixedThreadPool(3);

    public static void main(String[] args) throws InterruptedException, ExecutionException {


        List<FactorialTask> factorialTasks = new ArrayList<FactorialTask>();
        factorialTasks.add(new FactorialTask(5));
        factorialTasks.add(new FactorialTask(3));
        factorialTasks.add(new FactorialTask(7));

        System.out.println("All Tasks are submitted!");
        List<Future<Long>> futureList = threadpool.invokeAll(factorialTasks);
        threadpool.shutdown();

        while (!threadpool.isTerminated()) {
            System.out.println("Task is not completed yet....");
            Thread.sleep(1000); //sleep for 1 millisecond before checking again }
        }

        System.out.println("All Tasks are completed, let's check result");

        for (Future<Long> future : futureList) {
            System.out.println("Result is " + future.get());
        }

    }
}
