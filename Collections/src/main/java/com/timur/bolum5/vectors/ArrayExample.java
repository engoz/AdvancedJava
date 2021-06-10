package com.timur.bolum5.vectors;

/**
 * Created by enginoz on 10/14/15.
 */
public class ArrayExample {
    public static void main(String[] args) {
        String[] dizi = {"A", "B", "C"};
        System.out.println(dizi);
        dizi[4] = "Eng";
        //ArrayIndexOutOfBoundsException firlatir.
        System.out.println(dizi[5]);
    }
}
