package com.eng.collections.threads.local;

/**
 * Created by enginoz on 16/02/17.
 */
public class ThreadLocalTest {
    final static ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();

    static class MyRunnable implements Runnable {
        final Integer value;

        public MyRunnable(Integer value) {
            this.value = value;
        }

        @Override
        public void run() {
            threadLocal.set(value);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (threadLocal.get().equals(value)) {
                System.out.println("Match");
            } else {
                System.out.println("Not match");
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new MyRunnable(i)).start();
        }
    }
}
