package com.eng.volatiles;

/**
 * Created by servicium on 30.05.2016.
 */
public class RequiresVolatileMain2 {
    static volatile boolean value;

    public static void main(String... args) {
        new Thread(new MyRunnable2(true), "Sets true").start();
        new Thread(new MyRunnable2(false), "Sets false").start();
    }

    private static class MyRunnable2 implements Runnable {
        private final boolean target;

        private MyRunnable2(boolean target) {
            this.target = target;
        }

        @Override
        public void run() {
            int count = 0;
            boolean logged = false;
            while (true) {
                if (value != target) {
                    value = target;
                    count = 0;
                    if (!logged)
                        System.out.println(Thread.currentThread().getName() + ": reset value=" + value);
                } else if (++count % 1000000000 == 0) {
                    System.out.println(Thread.currentThread().getName() + ": value=" + value + " target=" + target);
                    logged = true;
                }
            }
        }
    }
}
