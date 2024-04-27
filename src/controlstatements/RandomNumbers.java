package controlstatements;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		
		
	Random random = new Random();
	
	//int s=random.nextInt(10);
	//System.out.println(s);
	
	
	int number=1;
	
	 while(number<10)
	 {
		 int myrandomnumber = random.nextInt(10)+1;
		 System.out.println(myrandomnumber);
		 number++;
		 
	 }

	}

}
