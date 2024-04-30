package pack;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		System.out.println("Enter any number " );
		Scanner r= new Scanner(System.in);
		num= r.nextInt();
		
		for(int i=1; i<=10; i++) {
			
		System.out.println(num+"*"+i+"=" +num*i);
		
		}
	}

}
