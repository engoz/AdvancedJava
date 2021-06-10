package com.timur.bolum4.collections;

import java.util.Collections;
import java.util.Stack;

/**
 * Created by enginoz on 10/9/15.
 */
public class CollectionFindMinMax {

    public static void main(String[] args) {
        Stack<String> stk = new Stack<String>();
        stk.push("I");
        stk.push("4");
        stk.push("2");
        stk.push("1");
        stk.push("E");
        stk.push("N");
        stk.push("G");
        stk.push("N");

        Object min = Collections.min(stk);
        System.out.println(min);

        Object max = Collections.max(stk);
        System.out.println(max);
    }

}
