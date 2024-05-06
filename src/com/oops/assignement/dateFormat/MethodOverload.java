package com.oops.assignement.dateFormat;

import java.time.LocalDate;
import java.util.Date;

public class MethodOverload {

    public static void main(String [] arg){
        Date date = new Date();
        String date1 = new String("25/05/2024");
        DateFormatter dateFormatter = new DateFormatter();
        System.out.println("Date format MM/DD/YYYY - "+dateFormatter.DateFormatter(date));
        System.out.println("Date format DD/MM/YYYY - "+dateFormatter.DateFormatter(date1));
        System.out.println("Date format dd-MON-YYY - "+dateFormatter.DateFormatter(20,"May", 2024));
    }
}
