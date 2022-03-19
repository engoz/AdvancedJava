package yaklasim;

public class ilkelPas {
    static void f(double a){
        System.out.println(a + " gönderildi");
        a = 10;
        System.out.println(" gönderilen parametre 10'a eşitlendi : " + a );
    }

    public static void main(String[] args) {
        double a = 5;
        f(a);
        System.out.println("a ---> " + a);
    }
}
