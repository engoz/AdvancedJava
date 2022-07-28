package com.eng.threadpool;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class CustomThreadPoolExe2 {
    public static void main(String[] args) {
        try {
            giveRangeOfLongs_whenSummedInParallel_shouldBeEqualToExpectedTotal();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
    public static void giveRangeOfLongs_whenSummedInParallel_shouldBeEqualToExpectedTotal()
            throws InterruptedException, ExecutionException {

        long firstNum = 1;
        long lastNum = 1_000_000;

        List<Long> aList = LongStream.rangeClosed(firstNum, lastNum).boxed()
                .collect(Collectors.toList());

        ForkJoinPool customThreadPool = new ForkJoinPool(4);
        long actualTotal = customThreadPool.submit(
                () -> aList.parallelStream().reduce(0L, Long::sum)).get();

        System.out.println((lastNum + firstNum) * lastNum / 2);
        System.out.println(actualTotal);
    }

    private static void test2()   throws InterruptedException, ExecutionException{
        long firstNum = 1;
        long lastNum = 1_000_000;
        ForkJoinPool customThreadPool = new ForkJoinPool(4);
        try {
            List<Long> aList = LongStream.rangeClosed(firstNum, lastNum).boxed()
                    .collect(Collectors.toList());
            long actualTotal = customThreadPool.submit(() -> aList.parallelStream().reduce(0L, Long::sum)).get();
            System.out.println((lastNum + firstNum) * lastNum / 2);
            System.out.println(actualTotal);
        } finally {
            //Memory Leak olmaması için kapatılması gerekir.
            //Memory Leak olmaması için kapatılması gerekir.
            customThreadPool.shutdown();
        }
    }
}
