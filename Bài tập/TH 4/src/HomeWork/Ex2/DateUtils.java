package HomeWork.Ex2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    public static void compareDate(String a, String b) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date1 = null;
        Date date2 = null;

        try {
            date1 = dateFormat.parse(a);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        try {
            date2 = dateFormat.parse(b);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println(date1);
        System.out.println(date2);

    }
}
