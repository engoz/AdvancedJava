package recursive;

public class Fibonacci2 {
    public static void main(String[] args) {
        //fiboDizi();
        System.out.println(fiboRecursive(10));
    }

    private static void fiboDongu(){
        //Fibonacci
        //1 1 2 3 5 8 13 21
        //a b c
        //  a b c
        //    a b c
        int a = 1;
        int b = 1;
        int c; //a +b
        System.out.println(a);
        System.out.println(b);
        for(int i = 0; i<10; i++){
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }

    private static void fiboDizi(){
        int[] fib = new int[10];
        fib[0] = 1;
        fib[1] = 1;
        for(int i = 0; i<8; i++){
            fib[i+2] = fib[i+1] + fib[i];
        }
        for(int i = 0; i<10; i++){
            System.out.println(fib[i]);
        }
    }

    private static int fiboRecursive(int n){
     if(n == 0) return 1;
     if(n == 1) return 1;
     return fiboRecursive(n -2) + fiboRecursive(n-1);
    }

}
