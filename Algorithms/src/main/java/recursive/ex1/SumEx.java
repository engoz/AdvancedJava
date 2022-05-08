package recursive.ex1;

public class SumEx {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }


    // sum(5) = sum(4) +5 = 15;
    // sum(4) = sum(3) +4 = 10
    // sum(3) = sum(2) +3 = 6
    // sum(2) = sum(1) +2 = 3
    // sym(1) = 0 + 1;
    private static int sum(int n){
        if(n >= 1)
            return sum(n-1)+n;
        return n;

    }

    public static int tailSum(int currentSum, int n) {
        if (n <= 1) {
            return currentSum + n;
        }
        return tailSum(currentSum + n, n - 1);
    }



}
