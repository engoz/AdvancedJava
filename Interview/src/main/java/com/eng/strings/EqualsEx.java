package com.eng.strings;

public class EqualsEx {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = new String("hello");
        String s3 = "hello";

        //1
        if (s1 == s2 ){
            System.out.println("s1 == s2 equals");
        }else {
            System.out.println("s1 == s2 not equals");
        }

        //2
        if (s1 == s3 ){
            System.out.println("s1 == s3 equals");
        }else {
            System.out.println("s1 == s3 not equals");
        }

        //3
        if (s1.equals(s2) ){
            System.out.println("s1 == s2 equals");
        }else {
            System.out.println("s1 == s2 not equals");
        }

        //4
        if (s1.equals(s3) ){
            System.out.println("s1 == s3 equals");
        }else {
            System.out.println("s1 == s3 not equals");
        }

    }
}
