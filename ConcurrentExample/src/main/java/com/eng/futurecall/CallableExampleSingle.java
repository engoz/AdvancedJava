package com.eng.futurecall;



import java.util.concurrent.*;

/**
 * Created by servicium on 09.12.2016.
 */
public class CallableExampleSingle {

    private static ExecutorService threadService = Executors.newSingleThreadExecutor();
    public static void main(String[] args) {

        FactorialCalculator factorialCalculator = new FactorialCalculator(10);

        Future<Integer> future = threadService.submit(factorialCalculator);

        try {
            System.out.println("Sonuc " + future.get() + "Future is " + future.isDone());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }
}
