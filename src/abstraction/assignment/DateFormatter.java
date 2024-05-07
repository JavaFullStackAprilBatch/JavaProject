package abstraction.assignment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {

    public String formatDate(String format,Date date){

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return  simpleDateFormat.format(date);
    }
    public String formatDate(Date date,String format){

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return  simpleDateFormat.format(date);
    }

    public Date formatDate(String date, String format) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        try {
            return simpleDateFormat.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
    public static void main(String[] args) {
        DateFormatter dateFormatter = new DateFormatter();
        System.out.println(dateFormatter.formatDate(new Date(),"MM/dd/yyyy"));
        System.out.println(dateFormatter.formatDate("dd/MM/yyyy",new Date()));
        System.out.println(dateFormatter.formatDate("2024/05/05","yyyy/MM/dd"));
    }
}
