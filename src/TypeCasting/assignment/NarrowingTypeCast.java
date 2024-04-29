package TypeCasting.assignment;

import java.util.Scanner;

public class NarrowingTypeCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("PLease enter your age : ");
		int inputInt = sc.nextInt();
		System.out.println("The integer input is " + inputInt);
		
		double inputDouble = (double)inputInt;
		System.out.println("The Double Conversion is " + inputDouble);
		
		float inputFloat = inputInt;
		System.out.println("The Float Conversion is " + inputFloat);
		
		byte inputByte = (byte) inputInt;
		System.out.println("The Byte Conversion is " + inputByte);
	}

}
