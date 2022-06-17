package com.eng.frokjoin;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class ParallelTest2 {
    public static void main(String[] args) {
        final int parallelism = 4;
        ForkJoinPool forkJoinPool = null;
        try {
            forkJoinPool = new ForkJoinPool(parallelism);
            final List<Integer> primes = forkJoinPool.submit(() ->
                    // Parallel task here, for example
                    IntStream.range(1, 1_000_000).parallel()
                            .filter(ParallelTest2::isPrime)
                            .boxed().collect(Collectors.toList())
            ).get();
            System.out.println(primes);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        } finally {
            if (forkJoinPool != null) {
                forkJoinPool.shutdown();
            }
        }
    }

    public static boolean isPrime(long n) {
        return n > 1 && LongStream.rangeClosed(2, (long) Math.sqrt(n)).noneMatch(divisor -> n % divisor == 0);
    }
}
