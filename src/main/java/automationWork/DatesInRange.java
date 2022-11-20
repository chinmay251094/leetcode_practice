package automationWork;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DatesInRange {
    public static void main(String[] args) throws ParseException {
        DatesInRange.isWithinRange("12/06/2021","12/05/2021","12/12/2021");

    }
    static Date isWithinRange(String startDate, String endDate, String testDate) throws ParseException {
        SimpleDateFormat s1 = new SimpleDateFormat("MM/d/yyyy", Locale.ENGLISH);
        Date d1 = s1.parse(startDate);

        SimpleDateFormat s2 = new SimpleDateFormat("MM/d/yyyy", Locale.ENGLISH);
        Date d2 = s1.parse(endDate);

        SimpleDateFormat s3 = new SimpleDateFormat("MM/d/yyyy", Locale.ENGLISH);
        Date d3 = s1.parse(testDate);

        return d3;
        //return ((tdate.isBefore(edate) || tdate.isEqual(edate)) && (tdate.isAfter(sdate) && tdate.isEqual(sdate)));
    }
}
