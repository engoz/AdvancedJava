package com.eng.executer;

import java.util.concurrent.Callable;

/**
 * Created by enginoz on 12/15/15.
 */
public class CallableCounter implements Callable<Integer>{

    int from;
    int to;

    public CallableCounter(int from,int to){
        this.from =from;
        this.to = to;
    }


    public Integer call() throws Exception {
        int sum = 0;
        for (int i= from; i<=to; i++){
            System.out.println(Thread.currentThread().getName() +" ----> "+i);
            sum = sum+i;
        }
        return sum;
    }
}
