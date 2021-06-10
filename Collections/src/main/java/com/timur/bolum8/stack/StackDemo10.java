package com.timur.bolum8.stack;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by servicium on 28.12.2015.
 */
public class StackDemo10 {
    public static void main(String[] args) {

        Stack<String> sk = new Stack<String>();

        sk.push("a");
        sk.push("c");
        sk.push("e");
        sk.push("d");

        Iterator it = sk.iterator();

        System.out.println("pop()dan önce   :" + sk.size());

        while (it.hasNext()) {
            String iValue = (String) it.next();
            System.out.println("Iterator değeri :" + iValue);
        }

        String value = (String) sk.pop();

        System.out.println("değer           :" + value);

        System.out.println("pop() dan sonra :" + sk.size());
    }
}
