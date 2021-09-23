package basic.recursive;

public class Fibonacci {

    public static void main(String[] args) {
        for (int j=0; j<10; j++){
            System.out.print(fibo(j)+"\t");
        }
    }

    private static int fibo(int n) {
        if(n==0 || n==1) return n;
        else
            return (fibo(n-1) + fibo(n-2));
    }
}
