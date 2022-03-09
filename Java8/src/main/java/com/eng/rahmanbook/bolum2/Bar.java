package com.eng.rahmanbook.bolum2;

/**
 * Created by servicium on 30.10.2015.
 */
public class Bar {

    public int calculate(Foo foo, int x, int y) {
        return foo.apply(x, y);
    }

    public static void main(String[] args) {

        Bar bar = new Bar();
        int sonuc = bar.calculate((x, y) -> (2 * x + y), 3, 5);
        System.out.println(sonuc);
    }
}
