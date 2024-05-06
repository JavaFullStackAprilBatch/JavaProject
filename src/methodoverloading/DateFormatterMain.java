package javaproj.assignment.methodoverloading;
import java.time.LocalDate;
public class DateFormatterMain {
	public static void main(String args[]) {
		
		DateFormatter d = new DateFormatter();
		
		System.out.println("Default format: " + d.dateFormat());
		System.out.println("Format 1: " + d.dateFormat("dd/MM/yyyy"));
		
		LocalDate date = LocalDate.now();
		System.out.println("Format 2: " + d.dateFormat(date, "MM/dd/yyyy"));
		
	}

}
