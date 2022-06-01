package com.eng.behavior.hashmaps;

import java.util.HashMap;

public class HashMapD {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put(TEST.HELLO.value, 1);
        map.put(TEST.MERHABA.value, 1);

        Integer integer = map.get(TEST.HELLO);
        System.out.println(integer);
    }

     enum TEST {
        MERHABA("M"),
        HELLO("H");

        private final String value;
        TEST(String value){
            this.value = value;
        }

        public String getValue(){
            return value;
        }

    }
}
