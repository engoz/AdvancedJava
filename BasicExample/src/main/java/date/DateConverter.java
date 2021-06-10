package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateConverter {


    public static void main(String[] args) throws ParseException {
        SimpleDateFormat haberFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        //haberFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String text = "2021-01-22T14:09:48";
        Date date = haberFormat.parse(text);
        System.out.println(date.getTime());
        System.out.println(date);
    }

}
