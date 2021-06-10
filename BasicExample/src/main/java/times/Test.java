package times;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test {

    public static void main(String[] args) {
        long toLong = Long.valueOf("1586527630000");
        Timestamp toTime = new Timestamp(toLong);
        Timestamp timestamp = calculateTime(toTime);
        System.out.println(timestamp);
    }


    public static Timestamp calculateTime(Timestamp t) {
        Calendar c = new GregorianCalendar();
        c.setTimeInMillis(t.getTime());
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        c.add(Calendar.MINUTE, 1);
        return new Timestamp(c.getTimeInMillis());
    }
}
