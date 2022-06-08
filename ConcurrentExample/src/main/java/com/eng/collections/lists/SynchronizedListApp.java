package com.eng.collections.lists;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by servicium on 30.05.2016.
 */
public class SynchronizedListApp {
    public static void main(String[] args) {
        List<String> list1 = Collections.synchronizedList(new ArrayList<String>());
        list1.add("list1 - #1");

        synchronized (list1) {
            Iterator<String> iter1 = list1.iterator();
            while (iter1.hasNext())
                try {
                    System.out.println(iter1.next());
                    list1.add("#2");
                }
                catch (ConcurrentModificationException cme) {
                    System.err.println("[List1]: attempt to modify");
                    break;
                }
        }

        List<String> list2 = new CopyOnWriteArrayList<String>();
        list2.add("list2 - #1");
        Iterator<String> iter2 = list2.iterator();
        while (iter2.hasNext()) {
            try {
                System.out.println(iter2.next());
                list2.add("#2");
            }
            catch (ConcurrentModificationException cme) {
                System.err.println("[List2]: attempt to modify");
                break;
            }
        }
    }
}
