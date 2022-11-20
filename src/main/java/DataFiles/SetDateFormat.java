package DataFiles;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SetDateFormat {
    public static void main(String[] args) {
        System.out.println(getDateTime());
    }

    public static String getDateTime()
    {
        long yourmilliseconds = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy HH.mm.ss");
        Date resultdate = new Date(yourmilliseconds);
        return String.valueOf(sdf.format(resultdate));
    }
}
