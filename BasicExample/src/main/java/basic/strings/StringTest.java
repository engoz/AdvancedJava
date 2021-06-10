package basic.strings;

import java.util.Date;

/**
 * Created by servicium on 16.12.2015.
 */
public class StringTest {

    public static void main(String[] args) {
        Person engin = new Person("Engin", new Date(1975, 2, 14));
        String name = engin.getName();
        //immutable not change
        name.concat("Oz");
        Date birthdate = engin.getBirhtDate();
        birthdate.setYear(1974);

        System.out.println("Name " + engin.getName());
        System.out.println("Birthdate " + engin.getBirhtDate().getYear());

        //syncronized multithread islemler icin
        StringBuffer buffer1 = new StringBuffer("Engin");
        StringBuffer buffer2 = buffer1.append("Oz");

        System.out.println(buffer1);
        System.out.println(buffer2);

        //not syncronized
        StringBuilder builder1 = new StringBuilder("Uras");
        StringBuilder builder2 = builder1.append("Oz");

        System.out.println(builder1);
        System.out.println(builder2);

    }
}
