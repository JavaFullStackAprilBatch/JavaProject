package Loops;

import java.util.Scanner;

public class multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=scanner.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(a + " x " + i + " = " + (a * i));
				
		}
		
	}

}
