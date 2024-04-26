package Loopsanddecision;

public class Leapyearass {
	
	public static void main(String arg[])
	{
		int year=2023;
		if(year%400==0)    //check first condition
		{
			System.out.println("is a leap year"  + year);
		}
		
		else if(year%100==0)  //check the second condition
		{
			System.out.println("is not a leap year" + year);
		}
		
		else if(year%4==0)   //third condition
		{
			System.out.println("is a leap year"  + year);
		}
		else {
			
			System.out.println("is not a leap year"  + year);
		}
		
	}

}
