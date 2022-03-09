package basic.strings;

public class BooleanToString {

    public static void main(String[] args) {
        boolean d = false;
        String cutomerInformation = "Engin" + "|" + "Oz" + "|" + d;
        String[] customer = cutomerInformation.split("\\|");
        System.out.println(customer[0]);
        System.out.println(customer[1]);
        System.out.println(customer[2]);
    }
}
