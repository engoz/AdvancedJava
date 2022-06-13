package com.eng.frokjoin;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class ParallelTest {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService es = Executors.newCachedThreadPool();

        es.execute(() -> runTask(1000)); //incorrect task
        es.execute(() -> runTask(0));
        es.execute(() -> runTask(0));
        es.execute(() -> runTask(0));
        es.execute(() -> runTask(0));
        es.execute(() -> runTask(0));


        es.shutdown();
        es.awaitTermination(60, TimeUnit.SECONDS);
    }

    private static void runTask(int delay) {
        IntStream.range(1, 1_000_000).parallel().filter(ParallelTest::isPrime).peek(i -> {
                    try {
                        Thread.sleep(delay);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }).max()
                .ifPresent(max -> System.out.println(Thread.currentThread() + " " + max));
    }

    public static boolean isPrime(long n) {
        return n > 1 && LongStream.rangeClosed(2, (long) Math.sqrt(n)).noneMatch(divisor -> n % divisor == 0);
    }
}
