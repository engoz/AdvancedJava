package com.eng.collections.maps;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class CacheSet<K> {
    public static final int TIME_OUT = 86400 * 1000;

    LinkedHashMap<K, Hit> linkedHashMap = new LinkedHashMap<K, Hit>() {
        @Override
        protected boolean removeEldestEntry(Map.Entry<K, Hit> eldest) {
            final long time = System.currentTimeMillis();
            if( time - eldest.getValue().time > TIME_OUT) {
                Iterator<Hit> i = values().iterator();

                i.next();
                do {
                    i.remove();
                } while( i.hasNext() && time - i.next().time > TIME_OUT );
            }
            return false;
        }
    };


    public boolean putIfNotExists(K key) {
        Hit value = linkedHashMap.get(key);
        if( value != null ) {
            return false;
        }

        linkedHashMap.put(key, new Hit());
        return true;
    }

    private static class Hit {
        final long time;


        Hit() {
            this.time = System.currentTimeMillis();
        }
    }
}