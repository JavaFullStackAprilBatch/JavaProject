package typecasting;

import java.util.Scanner;

public class InputFromUser {
	
	public static void main(String args[])
	
	{
		
		
		Scanner sc = new Scanner(System.in);
		
		
	     System.out.println("enter an integer:");
	     int number = sc.nextInt();
		
	     String mystring=String.valueOf(number);
		 System.out.println("after converting string :" +mystring);
		
		
		
	/*	System.out.println("enter a float number :");
		float f= sc.nextFloat();
		String s=String.valueOf(f);
		System.out.println(s);
		
		*/
		
		
		
		
		
     }
	
}
