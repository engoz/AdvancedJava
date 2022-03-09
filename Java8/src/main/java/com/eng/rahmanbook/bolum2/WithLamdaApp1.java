package com.eng.rahmanbook.bolum2;

/**
 * Created by servicium on 30.10.2015.
 */
public class WithLamdaApp1 {

    public int fonk(int a, int b, Anonim anonim) {
        return anonim.call(a, b) * 2;
    }

    public static void main(String[] args) {
        WithLamdaApp1 app1 = new WithLamdaApp1();
        app1.fonk(2, 3, (a, b) -> a + b);
    }


}
