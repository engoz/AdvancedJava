package com.eng.behavior.Array;

/**
 * Created by servicium on 17.02.2016.
 */
public class ArrayTest {
    public static void main(String[] args) {
        String[] strings = new String[2];
        strings[0] = "Engin";
        strings[1] = "Oz";
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
