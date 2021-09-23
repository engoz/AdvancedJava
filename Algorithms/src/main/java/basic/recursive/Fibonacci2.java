package basic.recursive;

public class Fibonacci2 {
    public static void main(String[] args) {
        int n0= 0, n1 = 1,n2;
        System.out.print( n0 + " " + n1 + " ");
        for(int i=0; i< 10; i++){
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0=n1;
            n1=n2;
        }

    }
}
