package com.eng.oo;

public class ConstructureEx {
    public static void main(String[] args) {
        Derived b = new DeriDerived();
    }
}
class BaseM {
    public BaseM() {
        System.out.println("Base");
    }
}

class Derived extends BaseM {
    public Derived() {
        System.out.println("Derived");
    }
}

class DeriDerived extends Derived {
    public DeriDerived() {
        System.out.println("DeriDerived");
    }
}


