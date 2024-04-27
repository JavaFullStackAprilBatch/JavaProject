package pack;

public class LeapYear {

	public static void main(String[] args) {
		int year = 3000;
        boolean leap = true;
		if (year % 4 ==0) {
			if (year % 100 ==0) {
				if (year % 400 ==00){
					leap = true;
				}
					
					else {
						leap = false;
						
					}
				
					System.out.println(year +" is leap year");
					
				}
				else {
					System.out.println(year + " is not a leap year");
				}
			}
				
		}
	}


