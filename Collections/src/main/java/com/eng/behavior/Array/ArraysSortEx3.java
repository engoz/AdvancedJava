package com.eng.behavior.Array;

import java.util.Arrays;

public class ArraysSortEx3 {
    public static void main(String[] args) {
        int[] a= {10,20,1,5,4,20,6,4,2,5,4,6,8,-5,-1};
        Arrays.sort(a);
        for(int i:a)
            System.out.print(i);
    }
}
