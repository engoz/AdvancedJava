package com.timur.bolum8.stack;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by servicium on 28.12.2015.
 */
public class StackDemo1 {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("Engin");
        stack.push("Ozlem");
        stack.push("Can");

        Iterator it = stack.iterator();
        System.out.println("pop oncesi stack" + stack.size());
        while (it.hasNext()) {
            String iValue = (String) it.next();
            System.out.println("Iterator value " + iValue);
        }

        //Yığıtın üstündeki veriyi al
        String value = stack.pop();
        System.out.println("Veri " + value);
        System.out.println("Pop sonrası " + stack.size());
    }


}
