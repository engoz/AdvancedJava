package com.eng.interfaces;

/**
 * Created by enginoz on 01/05/17.
 */
public interface InterfaceA {
    void saySomething();

    default void sayHi() {
        System.out.println("Hi Interface A");
    }
}
