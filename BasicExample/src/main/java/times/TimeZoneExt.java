package times;

import java.util.TimeZone;

public class TimeZoneExt {

    private final static TimeZone UK_TIME_ZONE = TimeZone.getTimeZone("Europe/London");
    private final static TimeZone ISTANBUL_TIME_ZONE = TimeZone.getTimeZone("Europe/Istanbul");
    private final static TimeZone GMT_TIME_ZONE = TimeZone.getTimeZone("GMT");
    private final static TimeZone UTC_TIME_ZONE = TimeZone.getTimeZone("UTC");

    public static void main(String[] args) {
        //Get default time zone
        System.out.println("1. UK_TIME time zone is:");
        System.out.println(UK_TIME_ZONE.getDisplayName());
        System.out.println(UK_TIME_ZONE);

        System.out.println("2. ISTANBUL_TIME time zone is:");
        System.out.println(ISTANBUL_TIME_ZONE.getDisplayName());
        System.out.println(ISTANBUL_TIME_ZONE);
        //Setting default time zone
        System.out.println("3.  GMT  time zone is :");
        System.out.println(GMT_TIME_ZONE.getDisplayName());
        System.out.println(GMT_TIME_ZONE);

        System.out.println("4.  UTC  time zone is : ");
        System.out.println(UTC_TIME_ZONE.getDisplayName());
        System.out.println(UTC_TIME_ZONE);

        //Get default time zone
        TimeZone timeZone = TimeZone.getDefault();
        System.out.println("4. Default time zone is:");
        System.out.println(timeZone);
        System.out.println(timeZone.getDisplayName());
    }
}
