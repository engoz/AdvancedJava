package com.eng.oo;

public class CastEx {
    public static void main(String[] args) {
        Base obj = new Base1();
        ((Base2) obj).test(); // CAST
    }
}

class Base {
    public void test() {
    }
}

class Base1 extends Base {
    public void test() {
        System.out.println("Base1");
    }
}

class Base2 extends Base {
    public void test() {
        System.out.println("Base2");
    }
}
