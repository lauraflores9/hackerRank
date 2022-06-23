package examples.day14;

//import java.util.Calendar;
//import java.util.Date;

import java.text.SimpleDateFormat;
import java.util.*;

public class CalendarPractice {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 111);
        System.out.println(cal.getTime());

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String formatted = format.format(cal.getTime());
        System.out.println(formatted);


    }
}
