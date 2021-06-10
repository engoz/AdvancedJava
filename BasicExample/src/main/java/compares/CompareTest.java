package compares;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class CompareTest {
    public static void main(String[] args) {
        List<MyObject> list = new ArrayList<>();
        Date date = new Date();
        list.add(new MyObject("A", date));
        Date date1 = (Date) date.clone();
        date1.setMinutes(10);
        list.add(new MyObject("B", date1));

        list.sort(new Comparator<MyObject>() {
            @Override
            public int compare(MyObject o1, MyObject o2) {
                return o1.getDateTime().getTime() > o2.getDateTime().getTime() ? 0 : 1;
            }
        });
        for (MyObject obj : list) {
            System.out.println(obj.getAd() + " " + obj.getDateTime());
        }


    }
}
