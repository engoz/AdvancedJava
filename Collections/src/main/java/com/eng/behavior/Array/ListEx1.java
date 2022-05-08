package com.eng.behavior.Array;


import java.util.ArrayList;
import java.util.List;

public class ListEx1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList();
       // addSuperStringToList(list);
        System.out.println(list);
    }

    static void addToList(List<Object> list){
        list.add("foo");
    }

    /*
    static void addExtendStringToList(List<? extends String> list){
        list.add("foo");
    }

    static void addSuperStringToList(List<? super String> list){
        list.add("foo");
    }

    <T>  void addGenericsToList(List<T> list){
        list.add("foo");
    }
*/
      void addRawToList(List list){
        list.add("foo");
    }

    void addToStringList(List<java.lang.String> list){
        list.add("foo");
    }
}

