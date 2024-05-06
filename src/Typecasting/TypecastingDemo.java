package Typecasting;
import java.util.Scanner;

public class TypecastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=s.nextInt();
		int b=s.nextInt();
		String str=Integer.toString(a);
		String str1=String.valueOf(a);
		System.out.println("After conversion using tostring method:"+str);
		System.out.println("After conversion using valueOf method:"+str1);
		
        //Narrowing and widening 
		
		
		byte b1=(byte)b;
		System.out.println("After narrowing"+b1);
		short sh=(short)b;
		System.out.println("After conversion to short method:"+sh);
		
		long l1=b;
		System.out.println("After widening to long:"+l1);
		
		float f1=b;
		System.out.println("After widening to float:"+f1);
	}

}
