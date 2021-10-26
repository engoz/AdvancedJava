package com.eng;

public class ReverseString2 {
    private static String s;

    public static void main(String[] args) {
        String s4=  usingRecursion("Merhaba engin naslsın");
        System.out.println(s4);
    }

    public static String usingRecursion(final String string) {
        System.out.println(s);
        if (string == null || string.isEmpty() || string.length() < 2) {
            return string;
        }
        return usingRecursion(string.substring(1)) + string.charAt(0);
    }
}
