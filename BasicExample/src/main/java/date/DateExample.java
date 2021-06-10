package date;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class DateExample {

    public static void main(String[] args) {
        Instant now = Instant.now();
        Instant yesterday = now.minus(1, ChronoUnit.DAYS);
        System.out.println(now);
        System.out.println(yesterday);
        System.out.println(yesterday.toEpochMilli());
    }
}
