package com.eng.behavior.queues.simplequeue;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by enginoz on 20/02/17.
 */
public class Test {
    public static void main(String[] args) {
        Queue queueA = new LinkedList();

        queueA.add("element 0");
        queueA.add("element 1");

        System.out.println(queueA.size());

        queueA.add("element 2");

        System.out.println(queueA.size());

//access via Iterator
        Iterator iterator = queueA.iterator();
        while (iterator.hasNext()) {
            String element = (String) iterator.next();
            System.out.println(element);
        }


//access via new for-loop
        for (Object object : queueA) {
            String element = (String) object;
            System.out.println(element);
        }
    }
}
