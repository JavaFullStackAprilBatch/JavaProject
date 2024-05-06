package Loops;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year=1900;
		if(year%4==0 && year%400==0) {
			System.out.println("year is leap year");
		}
		else {
			System.out.println("The year is not a leap year");
		}

	}

}
