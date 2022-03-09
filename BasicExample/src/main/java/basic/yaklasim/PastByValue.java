package basic.yaklasim;

public class PastByValue {
    public static void main(String[] args) {
        SomeObject someObject = new SomeObject("object 1");
        System.out.println(someObject);
        testMethod(someObject);
        System.out.println(someObject);
    }
    public static void testMethod(SomeObject someObjectX) {
        someObjectX = new SomeObject("object 2");
    }
}
class SomeObject {
    private String text;
    public SomeObject(String x){
    this.text = x;
    }

    @Override
    public String toString() {
        return "SomeObject{" +
                "text='" + text + '\'' +
                '}';
    }
}
