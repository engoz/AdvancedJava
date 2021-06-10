package date;

import java.sql.Time;

public class SpendingTime {


    public static void main(String[] args) {
        final long start = System.nanoTime();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.nanoTime();
        long elapsedTime = end - start;

        // 1 second = 1_000_000_000 nano seconds
        double elapsedTimeInSecond = (double) elapsedTime / 1_000_000_000;
        System.out.println("TokenService-SpendingTime " + elapsedTimeInSecond + " seconds");
    }
}
