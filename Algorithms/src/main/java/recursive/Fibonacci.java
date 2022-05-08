package recursive;

public class Fibonacci {

    public static void main(String[] args) {
        for (int j=0; j<10; j++){
            System.out.print(fibo(j)+"\t");
        }

        fibo2();
    }

    private static int fibo(int n) {
        if(n==0 || n==1) return n;
        else
            return (fibo(n-1) + fibo(n-2));
    }


    private static void fibo2(){
        //Fibonacci
        //1 1 2 3 5 8 13 21
        int n0= 0, n1 = 1, n2;
        System.out.print( n0 + " " + n1 + " ");
        for(int i=0; i< 10; i++){
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0=n1;
            n1=n2;
        }
    }
}
