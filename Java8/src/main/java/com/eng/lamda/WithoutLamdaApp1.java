package com.eng.lamda;

/**
 * Created by servicium on 30.10.2015.
 */
public class WithoutLamdaApp1 {

    public int fonk(int a, int b, Anonim anonim) {
        return anonim.call(a, b) * 2;
    }

    public static void main(String[] args) {
        WithoutLamdaApp1 app = new WithoutLamdaApp1();
        app.fonk(2, 3, new Anonim() {
            public int call(int a, int b) {
                return a + b;
            }
        });
    }
}
