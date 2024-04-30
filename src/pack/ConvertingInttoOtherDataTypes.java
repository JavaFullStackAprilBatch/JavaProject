package pack;

import java.util.Scanner;

public class ConvertingInttoOtherDataTypes {
	
	int a;
	short b;
	byte c;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any Integer number");
		Scanner r= new Scanner(System.in);
			int a= r.nextInt();
		short b= (short) a;
		System.out.println("Integer to Short " + b);
		
		byte c=(byte)a;
		System.out.println("Integer to Byte " + c);
		
		
		}

}
