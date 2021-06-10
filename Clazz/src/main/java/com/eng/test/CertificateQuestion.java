package com.eng.test;

/**
 * Created by enginoz on 7/3/16.
 */
public class CertificateQuestion {

    public static void main(String[] args) {
        A a = new B();

        //a.m1(); //try cath olmadan sorulmus exception handling yapılmasi gerekirdi.

        try {
            a.m1(); //line 1
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class A {
    private int i = 0;

    void m1() throws Exception {
        throw new Exception();
    }
}

class B extends A {

    @Override
    void m1() {

    }

}
