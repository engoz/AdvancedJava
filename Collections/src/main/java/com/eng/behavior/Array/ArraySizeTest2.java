package com.eng.behavior.Array;

/**
 * Created by enginoz on 23/10/17.
 */
public class ArraySizeTest2 {

    public static void main(String args[]) {
        int[] primes = {2, 3, 5, 7, 11, 13, 17};
        for (int i = primes.length - 1; i > 0; i--) {
            System.out.println(primes[i]);
        }


        for (int sayi : primes) {
            System.out.println(sayi);
        }
    }


}
