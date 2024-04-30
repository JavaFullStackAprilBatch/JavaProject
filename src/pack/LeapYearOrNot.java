package pack;

import java.util.Scanner;

public class LeapYearOrNot {
	//1. leap year= century (100%=0 and 400%=0)
	//2. yearly (100%!=0 and 4%=0)

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int y;
		System.out.println("Enter any year");
		Scanner r= new Scanner(System.in);
		y=r.nextInt();
	
		if(y%100==0 && y%400==0 || y%100!=0 && y%4==0) {
			
			System.out.println("Leap Year");
		}
	
	else {
		
		System.out.println("Not a Leap Year");
	}
	}
}
