package nazar.standard.classes;

import java.util.Calendar;
import java.util.Date;

public class DateCalendarApp {
    public static void main(String[] args) {
        System.out.println("Demo Date and Calendar");

        Date date = new Date();
        System.out.println(date);

        System.out.println("Demo Calendar, mengubah tanggal");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2000);
        Date result = calendar.getTime();
        System.out.println(result);

    }
}
