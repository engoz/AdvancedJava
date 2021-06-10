package com.eng.interfaces;

/**
 * Created by enginoz on 01/05/17.
 */
public class TestA implements InterfaceA, InterfaceB {

    public static void main(String[] args) {
        TestA testA = new TestA();
        testA.sayHi();
        testA.saySomething();

    }

    @Override
    public void saySomething() {
        System.out.println("Hello World");
    }


    @Override
    public void sayHi() {
        System.out.println("Main class");
    }


}
