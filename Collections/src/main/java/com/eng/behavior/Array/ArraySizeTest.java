package com.eng.behavior.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by enginoz on 05/09/17.
 */
public class ArraySizeTest {

    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("A");
        arr.add("C");
        arr.add("D");
        arr.add("E");
        arr.add("F");

        Object[] objects = new Object[arr.size()];
        int i = 0;
        for (String s : arr) {
            objects[i] = s + "-";
            i++;
        }

        for (Object obj : objects) {
            System.out.println(obj.toString());
        }


    }

}
