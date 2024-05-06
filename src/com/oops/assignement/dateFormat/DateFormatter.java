package com.oops.assignement.dateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {

    public String DateFormatter(Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        return simpleDateFormat.format(date);
    }

    public String DateFormatter(String date) {
          return String.format(date,"dd/MM/yyyy");
    }

    public String DateFormatter(int dd, String MON,int yyyy) {
        return String.format(dd+"-"+MON+"-"+yyyy);
    }

}
