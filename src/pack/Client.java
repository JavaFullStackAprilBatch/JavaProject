package pack;

import java.util.Scanner;

public class Client {
	
	
	
	public static void main(String a[]) {


		Logic l1 = new Logic();
		int b = l1.add(30, 10);


		System.out.println(l1.add(30, 10));


//     int z = x + 40;

//	System.out.println(x);
		Logic l2 = new Logic();

		int y = l2.add(50, 60);

		System.out.println(y);


		String s = "10";
		Integer i = Integer.parseInt(s);

		Scanner myObj = new Scanner(System.in);

		System.out.println("Enter name, age and salary:");

		// String input
		String name = myObj.nextLine();

		// Numerical input
		int age = myObj.nextInt();
		double salary = myObj.nextDouble();

		// Output input by user
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);


	}
	  
	   


}
