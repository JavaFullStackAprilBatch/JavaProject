package controlstatements;

public class LeapYear {

	public static void main(String[] args) {
		
		
		int year = 1929;
		
		if(year % 4 == 0 && year % 100 != 0)
		{
			System.out.println("the given year is leap year");
		}
		else
		{
			System.out.println(" the give year is not leap year");
			
		}
			

	}

}
