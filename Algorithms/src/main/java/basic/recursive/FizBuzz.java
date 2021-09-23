package basic.recursive;

public class FizBuzz {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if ((i % 5) == 0 && (i % 7) == 0) {        // is it a multiple of 5 and 7
                System.out.print("fizzbuzz");
            } else if ((i % 5) == 0) {        // is it a multiple of 5
                System.out.print("fizz");
            } else if ((i % 7) == 0) {        // is it a multiple of 7
                System.out.print("buzz");
            } else {
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
}
