package com.assignment.dateformatter;

import java.util.Date;

public class DateFormatterMain {
	
	static Date today = new Date();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormatter dateformat = new DateFormatter();
		
		dateformat.formatDate(today);
	}

}
