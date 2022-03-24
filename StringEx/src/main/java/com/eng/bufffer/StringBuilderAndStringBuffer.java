package com.eng.bufffer;

public class StringBuilderAndStringBuffer {

    public static void main(String[] args) {
        String s1 = "İlkay";
        concatString(s1);
        System.out.println("s1 after calling concatString(...) method:" + s1);
        s1.replace("İlkay", "Turgay");
        System.out.println("s1 after calling replace(...,...) method:" + s1);

        StringBuilder stringBuilder = new StringBuilder("Hakan Çetin");
        concatStringBuilder(stringBuilder);
        System.out.println(stringBuilder);

        StringBuffer stringBuffer = new StringBuffer("Mehmet");
        concatStringBuffer(stringBuffer);
        System.out.println(stringBuffer);

    }

    public static void concatString(String s1) {
        s1 = s1 + " " + "Günel";
    }

    public static void concatStringBuilder(StringBuilder s2) {
        s2.append("Kısa");
    }

    public static void concatStringBuffer(StringBuffer s3) {
        s3.append("Taşgit");
    }
}
