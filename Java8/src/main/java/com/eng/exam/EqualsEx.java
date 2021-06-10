package com.eng.exam;

public class EqualsEx {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = "Java2";
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("va");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(sb1.toString() == s1);
        System.out.println(sb1.toString().equals(s1));
        System.out.println(sb1.toString().compareTo(s3));
    }
}
