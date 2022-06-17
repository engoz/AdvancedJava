package com.eng.frokjoin;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Demo of {@code ForkJoinPool} behaviour in async and non-async mode.
 * Each worker thread in a ForkJoinPool has its own work queue. Async mode concerns the order in which each worker takes forked tasks that are never joined from its work queue.
 *
 * Workers in a ForkJoinPool in async mode process such tasks in FIFO (first in, first out) order. By default, ForkJoinPools process such tasks in LIFO (last in, first out) order.
 *
 * It's important to emphasise that the async mode setting only concerns forked tasks that are never joined. When using a ForkJoinPool for what it was originally designed for, namely recursive fork/join task decomposition, asyncMode doesn't come into play at all. Only when a worker is not engaged in actual fork/join processing does it execute async tasks, and only then is the asyncMode flag actually queried.
 *
 * Here's a small program that demonstrates the difference between the two different async mode settings:
 */
public class ForkJoinAsyncMode {
    public static void main(String[] args) {
        // Set the asyncMode argument below to true or false as desired:
        ForkJoinPool pool = new ForkJoinPool(
                4, ForkJoinPool.defaultForkJoinWorkerThreadFactory, null, true);

        pool.invoke(new RecursiveRangeAction(0, 200));
        pool.awaitQuiescence(2L, TimeUnit.SECONDS);
    }

    /**
     * A {@code ForkJoinTask} that prints a range if the range is smaller than a
     * certain threshold; otherwise halves the range and proceeds recursively.
     * Every recursive invocation also forks off a task that is never joined.
     */
    private static class RecursiveRangeAction extends RecursiveAction {
        private static final AtomicInteger ASYNC_TASK_ID = new AtomicInteger();

        private final int start;
        private final int end;

        RecursiveRangeAction(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        protected void compute() {
            if (end - start < 10) {
                System.out.format("%s range [%d-%d] done%n",
                        Thread.currentThread().getName(), start, end);
            } else {
                int mid = (start + end) >>> 1;
                int id = ASYNC_TASK_ID.incrementAndGet();

                System.out.format(
                        "%1$s [%2$d-%3$d] -< [%3$d-%4$d], fork async task %5$d%n",
                        Thread.currentThread().getName(), start, mid, end, id);

                // Fork off additional asynchronous task that is never joined.
                ForkJoinTask.adapt(() -> {
                    System.out.format("%s async task %d done%n",
                            Thread.currentThread().getName(), id);
                }).fork();

                invokeAll(new RecursiveRangeAction(start, mid),
                        new RecursiveRangeAction(mid, end));
            }
        }
    }
}
