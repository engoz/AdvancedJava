package logical;

/**
 * Created by servicium on 15.06.2015.
 */
public class LogicalExample {

    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean c = false;
        boolean d = false;

        //two compare
        System.out.println("two compare");
        System.out.println(a || b); //true
        System.out.println(c || d); //false
        System.out.println(a || c); //true
        System.out.println(c || b); //true

        //tree compare
        System.out.println("tree compare");
        System.out.println(a || b || c); //true
        System.out.println(c || d || a); //true
        System.out.println(a || c || b); //true
        System.out.println(c || b || d); //true


        System.out.println("test");

    }
}
