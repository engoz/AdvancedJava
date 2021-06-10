package mathss;

public class AbsFonction {

    // driver code
    public static void main(String args[]) {

        float a = 123.0f;
        float b = -34.2323f;

        double c = -0.0;
        double d = -999.3456;

        int e = -123;
        int f = -0;

        long g = -12345678;
        long h = 98765433;

        // abs() method taking float type as input
        System.out.println(Math.abs(a));
        System.out.println(Math.abs(b));

        // abs() method taking double type as input
        System.out.println(Math.abs(1.0 / 0));
        System.out.println(Math.abs(c));
        System.out.println(Math.abs(d));

        // abs() method taking int type as input
        System.out.println(Math.abs(e));
        System.out.println(Math.abs(f));
        System.out.println(Math.abs(Integer.MIN_VALUE));

        // abs() method taking long type as input
        System.out.println(Math.abs(g));
        System.out.println(Math.abs(h));
        System.out.println(Math.abs(Long.MIN_VALUE));
    }

}
