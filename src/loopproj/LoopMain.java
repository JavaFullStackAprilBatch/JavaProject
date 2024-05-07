package loopproj;
import java.util.Scanner;



public class LoopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Leapyear y = new Leapyear();
		Multiplication m = new Multiplication();
		Alphabet a = new Alphabet();
		Randno r = new Randno();
		
		int choice, num;
		char rep = 'y';
		while( rep == 'y') {
			System.out.print("Enter the size of the array:");
			
			System.out.println("Enter ur choice:\n 1. To find the given year is Leap yr or not\n 2. To print multiplication table for a given no\n 3. To print alphabets\n 4.To print random nos\n");
			choice = s.nextInt();
			switch(choice)
			{
				case 1: System.out.print("Enter a year");
						int year = s.nextInt();
						y.leap(year);
						break;
				case 2: System.out.print("Enter a no to print its mult table: ");
						num = s.nextInt();
						m.multi(num);
						break;
				case 3: a.alpha();
						break;
				case 4: r.rand();
						break;
						
				default: System.out.println("Invalid Choice");
			}
			System.out.println("Do u want to continue???");
			rep = s.next().charAt(0);	
			
		}
		s.close();	
		
	}

}


	


