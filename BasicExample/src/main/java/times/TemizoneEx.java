package times;

import java.util.TimeZone;

public class TemizoneEx {


    public static void main(String[] args) {
        //Get default time zone
        TimeZone timeZone = TimeZone.getDefault();
        System.out.println("1. Default time zone is:");
        System.out.println(timeZone);
        System.out.println(timeZone.getDisplayName());

        //Setting default time zone
        System.out.println("2. Setting UTC as default time zone");
        TimeZone utcTimeZone = TimeZone.getTimeZone("UTC");
        //Setting UTC time zone
        //TimeZone.setDefault(utcTimeZone);

        //Now get default time zone
        //timeZone = TimeZone.getDefault();
        System.out.println(timeZone);

        System.out.println("3. Exploring properties of timezone object : ");
        System.out.printf("3.1. DisplayName = %s, ID = %s, offset = %s",
                timeZone.getDisplayName(), timeZone.getID(), timeZone.getRawOffset());
    }

}
