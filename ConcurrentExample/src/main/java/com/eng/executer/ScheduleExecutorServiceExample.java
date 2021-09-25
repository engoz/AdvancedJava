package com.eng.executer;


import java.util.concurrent.*;

public class ScheduleExecutorServiceExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        call2();
    }

    private static void call1() throws ExecutionException, InterruptedException {
        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(5);

        ScheduledFuture scheduledFuture =
                scheduledExecutorService.schedule(new Callable() {
                                                      public Object call() throws Exception {
                                                          System.out.println("Executed!");
                                                          return "Called!";
                                                      }
                                                  },
                        5,
                        TimeUnit.SECONDS);

        System.out.println("result = " + scheduledFuture.get());

        scheduledExecutorService.shutdown();
    }

    private static void call2(){
        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(5);

        ScheduledFuture scheduledFuture =
                scheduledExecutorService.scheduleWithFixedDelay(new Runnable() {
                                                                    @Override
                                                                    public void run() {
                                                                        System.out.println("Schedule");
                                                                    }
                                                                },
                        5,
                        5,
                        TimeUnit.SECONDS);

        scheduledExecutorService.shutdown();
    }
}
