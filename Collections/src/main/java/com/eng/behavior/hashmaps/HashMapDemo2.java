package com.eng.behavior.hashmaps;

/**
 * Created by servicium on 10.06.2015.
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2 {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put("MERVE ALATLI", new Integer(20895548));
        hm.put("AYGÜN DAMLA", new Integer(20894820));
        hm.put("BÜYÜKKILIÇ AYKUT", new Integer(20893085));
        hm.put("CAN FEH?ME", new Integer(20793172));
        hm.put("CANER HAL?L ?BRAH?M", new Integer(20393385));
        Set set = hm.entrySet();
        Iterator i = set.iterator();
        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            System.out.println(me.getKey() + " : " + me.getValue());
        }

        // AYGÜN DAMLA 'ya yeni numara ver
        hm.put("AYGÜN DAMLA", new Integer(20894828));
        hm.putIfAbsent("MERVE ALATLI", new Integer(1));
        System.out.println("AYGÜN DAMLA : " + hm.get("AYGÜN DAMLA"));
        System.out.println("MERVE ALATLI : " + hm.get("MERVE ALATLI"));
    }
}
