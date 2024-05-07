package loopproj;

public class Leapyear {
	public void leap(int yr) {
		if(yr%4 == 0)
			if((yr % 400 == 0)|| (yr % 100 != 0))
				System.out.println("Its a Leap year");
			else 
				System.out.println("Its not a Leap year");
		else 
			System.out.println("Its not a Leap year");
					
	}

}
