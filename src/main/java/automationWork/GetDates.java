package automationWork;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class GetDates {
    public static LocalDate getFirstDayOfWeek() throws ParseException {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/d/yyyy");
        SimpleDateFormat sdf = new SimpleDateFormat("MM/d/yyyy", Locale.ENGLISH);

        LocalDate monday = today;
        while (monday.getDayOfWeek() != DayOfWeek.MONDAY) {
            monday = monday.minusDays(1);
        }
        Date date = sdf.parse(String.valueOf(monday));
        return monday;
    }

    public static void main(String[] args) throws ParseException {
        System.out.println(GetDates.getFirstDayOfWeek());
    }
}
