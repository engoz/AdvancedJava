package com.eng.behavior.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author engin.oz
 */
public class ArrayListSizeTest {

    public static void main(String[] args) {


        TestObject object = new TestObject();


        if (object.getArr().isEmpty()) {
            System.out.println("Empty");
        }


        object.getArr().add("A");
        object.getArr().add("C");
        object.getArr().add("D");
        object.getArr().add("E");
        object.getArr().add("F");

        Object[] objects = new Object[object.getArr().size()];
        int i = 0;
        for (String s : object.getArr()) {
            objects[i] = s + "-";
            i++;
        }

        for (Object obj : objects) {
            System.out.println(obj.toString());
        }
    }
}
