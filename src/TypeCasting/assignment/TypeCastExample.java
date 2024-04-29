package TypeCasting.assignment;

import java.util.Scanner;

public class TypeCastExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello.. Enter Any integer: ");
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("The integer input is " + number);
		String str = String.valueOf(number);
		System.out.println("The integer input as String " + str);
	}

}