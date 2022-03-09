package com.eng;

public class ReferansEx {

    public static void main(String[] args) {
        Sayi s1 = new Sayi();
        Sayi s2 = new Sayi();

        s1.i = 12;
        s2.i = 24;

        System.out.println(" S1.i = " + s1.i + " S2.i = " +s2.i );

        s1 = s2;

        System.out.println(" S1.i = " + s1.i + " S2.i = " +s2.i );

        s1.i = 49;

        System.out.println(" S1.i = " + s1.i + " S2.i = " +s2.i );

    }

}


class Sayi {
    int i;
}