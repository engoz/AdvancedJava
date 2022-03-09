package com.eng;

import java.util.HashSet;
import java.util.Set;

public class StringExample {
    public static void main(String[] args) {

        String userId = "20122016";
        String str = checkSet(userId);
        System.out.println(str);
    }

    private static String checkSet(String userId){
        Set<String> userIds = new HashSet<>();
        userIds.add("20122016");
        userIds.add("20006203");
        userIds.add("172929");
        userIds.add("20030220");
        userIds.add("20077771");
        userIds.add("20183415");
        userIds.add("20185635");

        if(!userIds.contains(userId)){
            return null;
        }
        return userId;
    }


}
