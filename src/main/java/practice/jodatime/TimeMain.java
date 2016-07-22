package practice.jodatime;

import org.joda.time.DateTime;

/**
 * Created by lnjasdf on 2016/7/22.
 */
public class TimeMain {
    public static void main(String[] arg) {
        DateTime dt = new DateTime();
        int month = dt.getMonthOfYear();  // where January is 1 and December is 12
        int year = dt.getYear();
        int day = dt.getDayOfMonth();
        System.out.println("day: " + day + " month: " + month + " year: " + year);
    }
}
