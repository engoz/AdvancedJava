package com.eng.interfaces;

/**
 * Created by enginoz on 01/05/17.
 */
public interface InterfaceB {
    default void sayHi() {
        System.out.println("Hi Interface B");
    }

    static boolean isNull(String str) {
        System.out.println("null check");
        return str == null ? true : "".equals(str) ? true : false;
    }
}
