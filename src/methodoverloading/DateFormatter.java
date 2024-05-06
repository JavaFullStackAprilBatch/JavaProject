package javaproj.assignment.methodoverloading;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatter {
	public LocalDate dateFormat() {
		LocalDate date = LocalDate.now();
		return date;
		
	}
	
	public String dateFormat(String d) { 
		LocalDate date = LocalDate.now();
		DateTimeFormatter dtobj = DateTimeFormatter.ofPattern(d);
		String  dfobj = date.format(dtobj);
		return dfobj;
		
		
	}
	
	public String dateFormat(LocalDate date, String d) {
		DateTimeFormatter dtobj = DateTimeFormatter.ofPattern(d);
		String  dfobj = date.format(dtobj);
		return dfobj;
		
	}

}
