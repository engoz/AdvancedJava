package com.eng;

public class EqualsIntern {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = new String("hello");

        boolean eq = s1 == s2.intern();
        System.out.println("Equals : " + eq);
    }
}
