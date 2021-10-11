package com.eng.scheduled;

import java.util.concurrent.*;

public class ScheduleExecutorCallable {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);

        Callable<Integer> task2 = ()-> {return 5; };
        Callable<Integer> task3 = ()-> 10;

        task1();

        ScheduledFuture<Integer> schedule = ses.schedule(task2,4,TimeUnit.SECONDS);
        ScheduledFuture<Integer> schedule2 = ses.schedule(task3,4,TimeUnit.SECONDS);

        task3();
        //block get result
        System.out.println(schedule.get());

        System.out.println(schedule2.get());

        System.out.println("Shut Down");
        ses.shutdown();

    }

    public static void task1() {
        System.out.println("Running task1...");
    }

    public static void task3() {
        System.out.println("Running task3...");
    }
}
