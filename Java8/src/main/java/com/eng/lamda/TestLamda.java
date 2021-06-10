package com.eng.lamda;

import java.util.function.BinaryOperator;

/**
 * Created by servicium on 23.10.2015.
 */
public class TestLamda {

    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Lamda Selam");
        runnable.run();
        MyRunable myRunable = new MyRunable();
        myRunable.run();
        BinaryOperator<Long> add = (x, y) -> x + y;
        System.out.println(add);
        BinaryOperator<Long> addExplicit = (Long x, Long y) -> x + y;
        System.out.println(addExplicit);
    }
}
