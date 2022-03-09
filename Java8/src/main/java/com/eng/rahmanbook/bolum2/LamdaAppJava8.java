package com.eng.rahmanbook.bolum2;

public class LamdaAppJava8 {
    public int fonk(int a, int b, Anonim anonim) {
        return anonim.call(a, b) * 2;
    }

    public static void main(String[] args) {
        LamdaAppJava8 app1 = new LamdaAppJava8();
        int result = app1.fonk(2, 3, (a, b) -> a + b);
        System.out.println(result);
    }
}
