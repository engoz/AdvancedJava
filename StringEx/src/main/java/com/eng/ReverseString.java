package com.eng;

import java.util.stream.Stream;

public class ReverseString {
    public static void main(String[] args) {
        // String s =  reverse("Merhaba engin naslsın");
        String s2 =  wordReverse("Merhaba engin naslsın");
        String s3 =  wordReverse2("Merhaba engin naslsın");
        String s4 =  reversedJava8("Merhaba engin naslsın");
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }

    public static String reversedJava8(String input){
        return  Stream.of(input.split(" ")).reduce("", (reversed, character) -> character +" "+ reversed);
    }

    public static String wordReverse2(String arg){
        return new StringBuilder(arg).reverse().toString();
    }

    public static String wordReverse(String input){
        String[] split = input.split(" ");
        StringBuilder returnString = new StringBuilder();
        for (int i= split.length-1; i>=0; i--){
            returnString.append(split[i] + " ");
        }
        return returnString.toString();
    }

    private static String reverse(String input){
        if(input.length() == 0){
            return null;
        }
        String reverse = null;
        char[] s = new char[input.length()];
        int k=0;
        for (int i=input.length()-1; i >= 0; i--){
            char c = input.charAt(i);
            s[k] = c;
            k++;
        }
        reverse =  String.copyValueOf(s);
        return reverse;
    }
}
