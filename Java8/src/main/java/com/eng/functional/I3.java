package com.eng.functional;

import java.util.Random;

public interface I3 {
    static int getNumber() {
        return new Random().nextInt(100);
    }

    default String M1(String s) {
        return s + getNumber();
    }
}
