package com.assignment.dateformatter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {
	public void formatDate(Date date) {
		SimpleDateFormat formate =  new SimpleDateFormat("yyyy - MM - dd");
		System.out.println(formate.format(date));
		
		SimpleDateFormat formate1 =  new SimpleDateFormat("dd - MM - yyyy");
		System.out.println(formate1.format(date));
		
		SimpleDateFormat formate2 =  new SimpleDateFormat("MM - dd - yyyy");
		System.out.println(formate2.format(date));
	}
}
