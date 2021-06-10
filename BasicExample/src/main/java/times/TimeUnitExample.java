package times;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class TimeUnitExample {

    public static void main(String[] args) {

        printOut("DAYS", TimeUnit.DAYS.toMillis(1));     // 1 day to milliseconds.
        printOut("MINUTES", TimeUnit.MINUTES.toMillis(23)); // 23 minutes to milliseconds.
        printOut("HOURS",TimeUnit.HOURS.toMillis(4));    // 4 hours to milliseconds.
        printOut("SECONDS",TimeUnit.SECONDS.toMillis(96)); // 96 seconds to milliseconds.
        printOut("TODAY",new Date().getTime());
    }

    private static void printOut(String time,long toMillis) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
        System.out.println(time + " - " +sdf.format(new Date(toMillis)));
    }
}
