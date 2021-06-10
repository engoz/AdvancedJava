package basic.numbers;

public class DoubleTest {

    public static void main(String[] args) {
        double a = 100.12345678;
        double b = 20.123456;
        double res = 0;
        for (int i = 0; i < 10; i++) {
            res -= a - b;
            System.out.println(res);
        }
    }


}
