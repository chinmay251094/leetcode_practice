package automationWork;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CompareDates {
    public static void main(String[] args) throws ParseException {
        System.out.println(CompareDates.comparingDates("12/06/2021","12/08/2021","12/12/2021"));
    }

    public static boolean comparingDates(String startDate, String endDate, String enteredDate) throws ParseException {
        //SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        //Date sDate = sdf.parse(startDate);
        Date sDate = (Date)formatter.parse(startDate);
        //Date eDate = sdf.parse(endDate);
        Date eDate = (Date)formatter.parse(endDate);
        //Date uDate = sdf.parse(enteredDate);
        Date uDate = (Date)formatter.parse(enteredDate);

        if(uDate.compareTo(sDate) >=0 && uDate.compareTo(eDate) <= 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
