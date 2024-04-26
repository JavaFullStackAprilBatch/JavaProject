package Loops;
import java.util.Random;
public class Randomnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random(); 
		for(int i=1;i<=10;i++) {
			int num=random.nextInt((10-1)+1);
			if(num!=5) {
				System.out.println("random number is:" +num);
			}
				
			
		}
       //While loop
		
		int num1;
		do {
			
			num1=random.nextInt(10-1)+1;
			System.out.println("random number using while is:"+num1);
		}while(num1!=5);
	}

}
