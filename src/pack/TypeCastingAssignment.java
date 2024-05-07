package pack;

import java.util.Scanner;

public class TypeCastingAssignment {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	     System.out.println("Enter int value: ");
	     int value = s.nextInt();
	     String str = String.valueOf(value);
	     System.out.println("String representation of the integer: " + str);


	     
	     Scanner s1 = new Scanner(System.in);
	     System.out.println("Enter int value: ");
	     int  val = s1.nextInt();
	     int a=val;
	     byte b=(byte) a;
	     System.out.println(b);
	}

}
