package Typecasting;

import java.util.Scanner;

public class Explicittypecon {
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter integer value");
		
		int num =sc.nextInt();
		
		short s=(short)num;
		System.out.println("converting in to short::"+s);
		
		byte b= (byte)num;
		System.out.println("converting in to byte::"+b);
		
		long l=(long)num;
		System.out.println("converting into the long::"+l);
		
		double d=(double)num;
		System.out.println("converting into double:"+d);
		
		char c=(char)num;
		System.out.println("converting into char:"+c);
		
		
		
		
		}

}
