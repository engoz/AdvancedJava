package com.eng.collections.lists;

/**
 * Created by servicium on 25.12.2015.
 */

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author www.enginoz.com
 */
public class CopyOnWriteArrayListApp {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<String>();
        list1.add("#1 add list1");
        Iterator<String> iter1 = list1.iterator();
        while (iter1.hasNext())
            try {
                System.out.println(iter1.next());
                list1.add("#2 list1");
            }
            catch (ConcurrentModificationException cme) {
                System.err.println("[List1]: attempt to modify");
                break;
            }

        List<String> list2 = new CopyOnWriteArrayList<String>();
        list2.add("#1 add list2");
        Iterator<String> iter2 = list2.iterator();
        while (iter2.hasNext()) {
            try {
                System.out.println(iter2.next());
                list2.add("#2 list2");
            }
            catch (ConcurrentModificationException cme) {
                System.err.println("[List2]: attempt to modify");
                break;
            }
        }
    }
}
