package dateFormatter;

import java.util.Date;

public class DateMain {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormatter obj=new DateFormatter();
      String formate=  obj.dateFormatter(date.toInstant().toEpochMilli());
      String formatt = obj.dateFormatter(11, 05, (long)2024);
      String format=  obj.dateFormatter(13,11,2024);

//        SimpleDateFormat formatdate = new SimpleDateFormat("yyyy-MM-dd");
//        String strdate = formatdate.format(date);
//        SimpleDateFormat formatdate1 = new SimpleDateFormat("MM-yyyy-dd");
//        String strdate1 = formatdate1.format(date);
//        SimpleDateFormat formatdate2 = new SimpleDateFormat("yyyy-MM-dd");
//        String strdate2 = formatdate2.format(date);

      System.out.println("Date in yyyy-MM-dd - " + formate);
       System.out.println("Date in MM-yyyy-dd - " + formatt);
       System.out.println("Date in dd-MM-yyyy - " + format);


    }
}
