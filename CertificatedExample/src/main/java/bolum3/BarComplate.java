package bolum3;

public class BarComplate {
    // Default values for numeric static variables set to a representation of 0
    static byte staticBarByte;
    static char staticBarChar;
    static short staticBarShort;
    static int staticBarInt;
    static long staticBarLong;
    static float staticBarFloat;
    static double staticBarDouble;

    // Default value for boolean static variables set to false;
    static boolean staticBarBoolean;

    // Default values for numeric instance variables set to a representation of 0
    byte barByte;
    char barChar;
    short barShort;
    int barInt;
    long barLong;
    float barFloat;
    double barDouble;

    // Default value for boolean instance variables set to false;
    boolean barBoolean;

    public static void main(String[] args) {
        BarComplate bar = new BarComplate();

        // These class variable references do not produce compile errors
        System.out.println("----------  Class Variables set to default values --------------");
        System.out.println("Bar.staticByte=" + BarComplate.staticBarByte);
        System.out.println("Bar.staticChar=" + BarComplate.staticBarChar);
        System.out.println("Bar.staticShort=" + BarComplate.staticBarShort);
        System.out.println("Bar.staticInt=" + BarComplate.staticBarInt);
        System.out.println("Bar.staticLong=" + BarComplate.staticBarLong);
        System.out.println("Bar.staticFloat=" + BarComplate.staticBarFloat);
        System.out.println("Bar.staticDouble=" + BarComplate.staticBarDouble);
        System.out.println("Bar.staticBoolean=" + BarComplate.staticBarBoolean);

        // These object instance variable references do not produce compile errors
        System.out.println("----------  Instance Variables set to default values --------------");
        System.out.println("barByte=" + bar.barByte);
        System.out.println("barChar=" + bar.barChar);
        System.out.println("barShort=" + bar.barShort);
        System.out.println("barInt=" + bar.barInt);
        System.out.println("barLong=" + bar.barLong);
        System.out.println("barFloat=" + bar.barFloat);
        System.out.println("barDouble=" + bar.barDouble);
        System.out.println("barBoolean=" + bar.barBoolean);
    }
}
