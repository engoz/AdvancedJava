package com.timur.bolum8.stack;

import java.util.Vector;

/**
 * Created by servicium on 28.12.2015.
 */
public class StackDemo3 {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.addElement("a");
        for (int i = 0; i < 10; i++) {
            v.addElement(new Integer(i));
        }
        System.out.println(v);
        System.out.println(v.capacity());
        v.addElement("b");
        System.out.println(v.capacity());
    }
}
