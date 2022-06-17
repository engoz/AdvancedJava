package com.eng.collections.maps;

import org.apache.commons.collections4.map.PassiveExpiringMap;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class PassiveExpiringMapTest {
    public static void main(String[] args) {
        PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<String, Integer>
                expirationPolicy = new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<>(
                5, TimeUnit.SECONDS);

        PassiveExpiringMap<String, Integer> expiringMap = new PassiveExpiringMap<>(expirationPolicy, new HashMap<>());
        expiringMap.put("one", Integer.valueOf(1));
        expiringMap.put("two", Integer.valueOf(2));
        expiringMap.put("three", Integer.valueOf(3));
        int initialCapacity = expiringMap.size();
        System.out.println("initialCapacity = " + initialCapacity);


        System.out.println("Sleeping...");
        try { Thread.sleep(10000L); } catch (InterruptedException e) { }

        int updatedCapacity = expiringMap.size();
        System.out.println("updatedCapacity = " + updatedCapacity);

    }
}
