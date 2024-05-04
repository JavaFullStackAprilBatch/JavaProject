package oopassignments.DataFormatter_MethodOverloading;


import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {
	
	//Format date in MM/dd/yyyy style
    public String formatDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        return sdf.format(date);
    }
    
  //Format date in dd/MM/yyyy style
    public String formatDate(Date date, boolean dd) {
        if (dd) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            return sdf.format(date);
        } else {
            return formatDate(date);
        }
    }
    
    // Format date in yyyy-MM-dd style
    public String formatDate(int year, int month, int day) {
        return String.format("%04d-%02d-%02d", year, month, day);
    }

}
