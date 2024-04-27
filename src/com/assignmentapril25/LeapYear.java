package com.assignmentapril25;

public class LeapYear {
	

  /* A year may be a leap year if it is evenly divisible by 4.
	 Years divisible by 100 (century years such as 1900 or 2000) cannot be leap
	 years unless they are also divisible by 400. (For this reason, the years
	 1700, 1800, and 1900 were not leap years, but the years 1600 and 2000 were.)
  */
	public void check(int year) {
		
			if (year%4 == 0 && (year%100!=0 ||year%400==0)){
				System.out.println(year +" is a leap year");
			}
			else
				System.out.println(year+ "  is not a leap year");
		}
	public static void main(String args[]) {
		LeapYear obj=new LeapYear();
		obj.check(1904);
		obj.check(1900);
		obj.check(2000);
		obj.check(2003);
		obj.check(2008);

	}
	

}
 