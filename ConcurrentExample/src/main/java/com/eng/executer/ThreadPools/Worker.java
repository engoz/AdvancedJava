package com.eng.executer.ThreadPools;

/**
 * Created by enginoz on 10/23/16.
 */
public class Worker implements Runnable {

    private String command;

    public Worker(String command){
        this.command = command;
    }


    @Override
    public void run() {
        long start = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName() +" Start Command ."+command);
        proccessCommand();
        System.out.println(Thread.currentThread().getName() +" End and Time " + (System.currentTimeMillis() - start));
    }

    private void proccessCommand() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return command;
    }
}
