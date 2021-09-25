package com.eng.executer.ThreadPools;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by enginoz on 10/23/16.
 */
public class RejectedExecutionHandlerImpl implements RejectedExecutionHandler {
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println(r.toString() + "is rejected");
    }
}
