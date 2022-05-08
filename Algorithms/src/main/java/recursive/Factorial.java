package recursive;

public class Factorial {

    public static void main(String[] args) {
        System.out.println("Faktorial " + fac(6));
    }

    private static int fac(int n) {
        if(n<=1) return n;
        else
        return n * fac(n-1);
    }
}
