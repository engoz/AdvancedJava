package com.eng;

public class StringEx2 {
    public static void main(String[] args) {
        String s = "a";
        changeString(s);
        System.out.println(s);
    }

    public static void changeString(String s) {
        s = "b";
    }
}
