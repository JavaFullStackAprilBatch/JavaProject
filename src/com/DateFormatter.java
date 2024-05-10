package com;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateFormatter {

    //Method overloading
    public String getDateFormat(){
    LocalDateTime dt = LocalDateTime.now();
     return dt.toString();
    }

    public String getDateFormat(int formatType){
        LocalDateTime dt = LocalDateTime.now();

        String returnformat = null;
        if(formatType == 1){
            DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            returnformat = dt.format(format1);

        }else if (formatType == 2){
            DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            returnformat = dt.format(format2);

        }else{
            returnformat = dt.toString();
        }
        return returnformat;

    }

    //object
        public static void main(String[] args) {
        DateFormatter currentDate = new DateFormatter();
        System.out.println(currentDate.getDateFormat(2));
        System.out.println(currentDate.getDateFormat(1));



    }
}
