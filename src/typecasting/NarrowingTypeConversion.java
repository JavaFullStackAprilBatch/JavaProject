package typecasting;

import java.util.Scanner;

public class NarrowingTypeConversion {

	public static void main(String[] args) {
			
	
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter an Integer value :");
		int  i1 = sc.nextInt();
		byte b =  (byte) i1;
		System.out.println("after converting int to byte :"+b);
		
		System.out.println("Enter an Integer  value:");
		int  i2= sc.nextInt();
		short s=(short) i2;
		System.out.println("after converting int to short :" +s);
		
		
		System.out.println("Enter an Integer value  :");
		int i3=sc.nextInt();
		long l = i3;
		System.out.println("after converting int to long :" +l);
		
		
		System.out.println("Enter an Integer value :");
		int i4=sc.nextInt();
		float f = (float) i4;
		System.out.println("after converting int to float :" +f);
		
		
		System.out.println("Enter an Integer  value :");
		int i5=sc.nextInt();
		double d = (float) i5;
		System.out.println("after converting int to float :" +d);
		
		
		//converting byte to other Datatypes
		
		
		System.out.println("Enter a Byte value:");
		byte b1 =sc.nextByte();
		short s1= b1;
		System.out.println("after converting byte value to short value :" +s1);
		

		System.out.println("Enter a Byte value:");
		byte b2 =sc.nextByte();
		long l1= b2;
		System.out.println("after converting byte value to long value :" +l1);
		

		System.out.println("Enter a Byte value:");
		byte b3 =sc.nextByte();
		float f1= b3;
		System.out.println("after converting byte value to short value :" +f1);
		
		
		System.out.println("Enter a Byte value:");
		byte b4 =sc.nextByte();
		double d1= b4;
		System.out.println("after converting byte value to double value :" +d1);
		
		System.out.println("Enter a Byte value:");
		byte b5 =sc.nextByte();
		int i6 = b5;
		System.out.println("after converting byte value  to int value :" +i6);
		
		
		//converting short to other Datatypes
		
		System.out.println("Enter a Short value:");
		short s2 =sc.nextShort();
		byte b6 = (byte) s2;
		System.out.println("after converting short value to byte value :" +b6);
		
		System.out.println("Enter a Short value:");
		short s3 =sc.nextShort();
		long l3 =  s3;
		System.out.println("after converting short value to long value :" +l3);
		
		System.out.println("Enter a Short value:");
		short s5 =sc.nextShort();
		float f3 =  s5;
		System.out.println("after converting short value to float value :" +f3);
		
		
		System.out.println("Enter a Short value:");
		short s6=sc.nextShort();
		int i8 = s6 ;
		System.out.println("after converting short value to int value  :" +i8);
		
		

		System.out.println("Enter a Short value:");
		short s7=sc.nextShort();
		double d2 = s7 ;
		System.out.println("after converting short value to double value  :" +d2);
		
		//converting long to other Datatypes
		
		
		System.out.println("Enter a long value:");
		long l4 =sc.nextLong();
		byte b8 = (byte) l4 ;
		System.out.println("after converting long value to byte value  :" +b8);
		
		
		System.out.println("Enter a long value:");
		long l5 =sc.nextLong();
	    short s8 = (byte) l5 ;
		System.out.println("after converting long value to short value  :" +s8);
		
		
		System.out.println("Enter a long value:");
		long l6 =sc.nextLong();
	    int i9 = (int) l6;
		System.out.println("after converting long value to int value  :" +i9);
		
		System.out.println("Enter a long value:");
		long l7 =sc.nextLong();
	    float f4 = (int) l7;
		System.out.println("after converting long value to float value  :" +f4);
		

		System.out.println("Enter a long value:");
		long l8 =sc.nextLong();
	    double d3 =  l8;
		System.out.println("after converting long value to double value  :" +d3);
		
		
		//converting double to other Datatypes
		
		
		System.out.println("Enter a Double value:");
		double d4 =sc.nextDouble();
	    byte b9 =  (byte) d4;
		System.out.println("after converting double value to byte value  :" +b9);
		
		System.out.println("Enter a Double value:");
		double d5 =sc.nextDouble();
	    short s9 =   (short) d5;
		System.out.println("after converting double value to short value:" +s9);
		
		System.out.println("Enter a Double value:");
		double d6 =sc.nextDouble();
	    int i10 = (int) d6;
		System.out.println("after converting double value to int value:" +i10);
		
		
		System.out.println("Enter a Double value:");
		double d7 =sc.nextDouble();
	    long l9 = (int) d7;
		System.out.println("after converting double value to long value:" +l9);
		
		
		System.out.println("Enter a Double value:");
		double d8 =sc.nextDouble();
	    float f5 =  (float) d8;
		System.out.println("after converting double value to float value:" +f5);
		
		
		//converting float to other Datatypes
		
		System.out.println("Enter a Float value:");
		float f6 =sc.nextFloat();
	    byte b10 = (byte) f6;
		System.out.println("after converting float value to byte value:" +b10);
		
		System.out.println("Enter a Float value:");
		float f7 =sc.nextFloat();
	    short s10 =  (short) f7;
		System.out.println("after converting float value to short value:" +s10);
		
		System.out.println("Enter a Float value:");
		float f8 =sc.nextFloat();
	    int i11 =  (int) f8;
		System.out.println("after converting float value to int value:" +i11);
		
		System.out.println("Enter a Float value:");
		float f9 =sc.nextFloat();
	    long l10 =  (long) f9;
		System.out.println("after converting float value to long value:" +l10);
		
		
		System.out.println("Enter a Float value:");
		float f10 =sc.nextFloat();
	    double d9 =  f10;
		System.out.println("after converting float value to double value:" +d9);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}	
		
		
		
		
		
		