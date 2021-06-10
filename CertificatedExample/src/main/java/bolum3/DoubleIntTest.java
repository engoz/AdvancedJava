package bolum3;

public class DoubleIntTest {
    public static void main(String[] args) {
        double result = 0;
        int price = 100;
        double tax = 0.05;
        //cannont plus int = int + double
        result = price + tax;
        System.out.println("Adjusted Price" + result);
    }
}
