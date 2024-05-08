package dateFormatter;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatter {

    public String dateFormatter(long milliSecond) {
        SimpleDateFormat formatdate = new SimpleDateFormat("yyyy-MM-dd");

        Date date = new Date(milliSecond);

        String strdate = formatdate.format(date);
  return strdate;

    }

    public String dateFormatter(int m, int d, long y) {
        SimpleDateFormat formatdate1 = new SimpleDateFormat("MM-yyyy-dd");
        Calendar date= Calendar.getInstance();
        date.set((int) y,m,d);

        String strdate1 = formatdate1.format(date.getTime());
       return strdate1;
    }

    public String dateFormatter(int d, int m, int y) {
        SimpleDateFormat formatdate2 = new SimpleDateFormat("yyyy-MM-dd");
      //  String strdate2 = formatdate2.format(date);
       // System.out.println("Date in dd-MM-yyyy - " + strdate2);
        Calendar date= Calendar.getInstance();
        date.set(y,m,d);

        String strdate2 = formatdate2.format(date.getTime());
        return strdate2;


    }


}
