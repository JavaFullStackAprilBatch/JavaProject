package loopproj;
import java.util.Random;

public class Randno {
	public void rand() {
		Random r = new Random();
		Boolean b = true;
		int n;
		System.out.println("Random nos using While loop");
		while(b) {
			n= r.nextInt(11);
			if (n==5) {
				System.out.println("No.5 generated Exiting the while loop");
				break;}
			System.out.println(n);
		
		}
		System.out.println("Random nos using For loop");
		for( ; b ; ) {
			n= r.nextInt(11);
			if (n==5) {
				System.out.println("No.5 generated Exiting the for loop");
				break; }
			System.out.println(n);
			
		}
	}
	

}
