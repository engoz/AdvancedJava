package com.eng.executer;

/**
 * Created by enginoz on 12/15/15.
 */
public class Counter implements Runnable {

    int from;
    int to;

    public Counter(int from,int to){
        this.from =from;
        this.to = to;
    }


    public void run() {
        for (int i= from; i<=to; i++){
            System.out.println(Thread.currentThread().getName() +" ----> "+i);

        }
    }
}
