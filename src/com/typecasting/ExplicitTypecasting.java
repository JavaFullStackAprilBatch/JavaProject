package com.typecasting;

import java.util.Scanner;

public class ExplicitTypecasting {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		int num = sc.nextInt();
		System.out.println("The number entered by the user: " + num);
		short s = (short) num;
		System.out.println("short: " + s);
		byte b = (byte) num;
		System.out.println("byte: " + b);
		long l = (long) num;
		System.out.println("Long: " + l);
		double d = (double) num;
		System.out.println("double: " + d);
		float f = (float) num;
		System.out.println("float: " + f);
		boolean bo = true;
		System.out.println("boolean: " + bo);
		char ch = (char) num;
		System.out.println("char: " + ch);

	}

}
