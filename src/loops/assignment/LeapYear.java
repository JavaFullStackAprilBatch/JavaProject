package loops.assignment;

public class LeapYear {
	
	int leapYear;
	
	//boolean isLeap = false;
	
	public boolean findLeapYear(int year) {
		
		int reminding= year%4;
		if (reminding==0){
			return true;
		}else
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LeapYear lp= new LeapYear();
		
		int year = 2001;
		if(lp.findLeapYear(year)) {
			System.out.println("Yes It is A Leap year");
		}
		else {
			System.out.println("No It is not A Leap year");
		}
		
	}

}
