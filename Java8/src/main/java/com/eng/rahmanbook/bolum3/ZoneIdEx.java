package com.eng.rahmanbook.bolum3;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdEx {
    public static void main(String[] args) {
        Set<String> zones = ZoneId.getAvailableZoneIds();

        zones.stream().sorted().forEach(System.out::println);

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);
        //-Duser.timezone=Europe/Istanbul

    }
}
