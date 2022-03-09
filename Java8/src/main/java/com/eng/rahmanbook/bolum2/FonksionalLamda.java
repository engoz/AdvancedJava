package com.eng.rahmanbook.bolum2;


/**
 * Created by servicium on 30.10.2015.
 */
public class FonksionalLamda {

    public static void main(String[] args) {
        Foo foo = (x, y) -> (2 * x + y);
        int sonuc = foo.apply(2, 3);
        System.out.println("Sonuc " + sonuc);

        Foo foo1 = (a, b) -> (int) Math.pow(a, b);

        int sonuc2 = foo1.apply(2, 3);
        System.out.println("Sonuc 2 = " + sonuc2);
    }
}
