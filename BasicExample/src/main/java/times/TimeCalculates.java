package times;

public class TimeCalculates {

    public static void main(String[] args) {
        final long startTime = System.nanoTime();
        test();
        final long duration = System.nanoTime() - startTime;
        System.out.println(duration);
    }

    public static void test() {
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
