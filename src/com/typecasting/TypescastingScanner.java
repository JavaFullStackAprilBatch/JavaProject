package com.typecasting;

import java.util.Scanner;

public class TypescastingScanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		// converted int to string
		String numStr = Integer.toString(num);

		System.out.printf("The number enter by the user:%s", numStr);

	}

}
