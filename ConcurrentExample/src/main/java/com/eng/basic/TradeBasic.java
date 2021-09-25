package com.eng.basic;

/**
 * Created by enginoz on 16/02/17.
 */
public class TradeBasic {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread Calisti");
            }
        });
        t1.start();
    }

}
