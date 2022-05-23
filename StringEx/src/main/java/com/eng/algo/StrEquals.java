package com.eng.algo;

public class StrEquals {
    public boolean strEqual(String a, String b) {

        for (int i = 0; i < Math.min(b.length(), a.length()); i++)
            if (a.charAt(i) != b.charAt(i)) return false;
        return a.length() == b.length();
    }

    public static void main(String[] args) {
        StrEquals strEquals = new StrEquals();
        String a = "Engin merhaba nasılsın iyimisin";
        String b = "Engin merhaba nasılsın iyimisin";
        long start = System.nanoTime();

        boolean equalsMethod = strEquals.strEqual(a, b);
        long end = System.nanoTime();
        System.out.println("Time : " + (end -start) + " " + equalsMethod);

        start = System.nanoTime();
        boolean equals = a.equals(b);
        end = System.nanoTime();
        System.out.println("Time : " + (end -start) +" "+ equals);

    }
}
