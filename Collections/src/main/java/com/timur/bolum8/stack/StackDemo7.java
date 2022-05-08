package com.timur.bolum8.stack;

import java.util.Stack;

/**
 * Created by servicium on 28.12.2015.
 */
public class StackDemo7 {

    public static void main(String[] args) {
        Stack st = new Stack();
        st.add("11");
        st.add("22");
        st.add("33");
        st.add("44");
        st.add("55");
        st.add("66");
        st.add("77");
        st.add("88");
        st.add("99");
        st.add("100");
        System.out.println(st);
        if (st.contains("33"))
            System.out.println("Aranan öğe bulundu!");
    }


}
