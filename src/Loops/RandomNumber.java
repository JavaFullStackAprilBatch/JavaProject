package Loops;

import java.util.Scanner;

//random numbers
public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int number=scanner.nextInt();
		
		for (int i =1;i<=number;i++)
		{
			System.out.print(" "+i);
		}
		System.out.println("");
		System.out.println("Enter the number for while loop");
		int num=scanner.nextInt();
		int i=1;
		while(i<=num)
		{
			System.out.print(" "+i);
			i++;
		}
	}

}
