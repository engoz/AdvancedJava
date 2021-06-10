package com.timur.bolum8.stack;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by servicium on 28.12.2015.
 */
public class StackDemo6 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(new Integer(23));
        stack.push(new Integer(57));
        stack.push(new Integer(34));
        stack.push(new Integer(7));

        Iterator it = stack.iterator();

        System.out.println("pop dan onceki boyut " + stack.size());
        while (it.hasNext()) {
            Integer iValue = (Integer) it.next();
            System.out.println("Iteratorun degersi : " + iValue);
        }

        Integer value = (Integer) stack.pop();
        System.out.println("En üstten alınan öge " + value);
        System.out.println("pop dan sonraki boyut " + stack.size());

    }
}
