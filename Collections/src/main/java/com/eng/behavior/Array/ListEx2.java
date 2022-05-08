package com.eng.behavior.Array;

import java.util.ArrayList;
import java.util.List;

public class ListEx2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<30; i++){
            list.add(i);
        }

        /*
        Iterator<Integer> it = list.iterator();

        while (it.hasNext()){
            Integer next = it.next();
            if (next % 2 == 0){
                it.remove();
            }
        }

        List<Integer> tmp = new ArrayList<Integer>();
        for (Integer next:list){
            if (next % 2 == 0){
                tmp.add(next);
            }
        }
        list.removeAll(tmp);
  */

        for(Integer element: list){
            if (element % 2 == 0){
                list.remove(element);
            }
        }
        System.out.println(list);

    }
}
