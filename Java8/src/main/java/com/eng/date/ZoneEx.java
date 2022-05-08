package com.eng.date;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneEx {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now(); //Local date time


        ZoneId zoneId = ZoneId.of( "Asia/Kolkata" );  //Zone information

        ZonedDateTime zdtAtAsia = ldt.atZone( zoneId );	//Local time in Asia timezone

        ZonedDateTime zdtAtET = zdtAtAsia
                .withZoneSameInstant( ZoneId.of( "America/New_York" ) );

        System.out.println(zdtAtAsia);
        System.out.println(zdtAtET);


    }

    public static ZonedDateTime convertDateTime(ZonedDateTime source, ZoneId sourceId, ZoneId targetId){
        if (sourceId.equals(targetId)){
            return source;
        }
        return source.withZoneSameLocal(sourceId).withZoneSameInstant(targetId);
    }


}
