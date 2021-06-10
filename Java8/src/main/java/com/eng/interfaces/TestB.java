package com.eng.interfaces;

/**
 * Created by enginoz on 22.05.2018.
 */
public class TestB implements InterfaceB {
    public static void main(String[] args) {
        TestB testB = new TestB();
        testB.sayHi();
        boolean test = InterfaceB.isNull("test");
        System.out.println(test);
    }
}
