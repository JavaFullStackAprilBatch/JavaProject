package pack;

public class DataTypesExample {
	public static void main(String a[]) {
		Byte b = 100;  // 1 byte   -128 to 127   2 power 7 to 2^7  -1
		System.out.println(b);   
		
		Short s =  30000;    // 2 bytes  -32768 to 32767     2^16 
		System.out.println(s);
		
		Integer i = 300000000;   // 4 bytes  --32 bits       2^32    
		System.out.println(i);
		
		Long l = 60000000000L;
		System.out.println(l);// 8 bytes --- 64 bits
		
		
		Float f = 3.1477907799999f;    //  4 bytes   //upto 6 decimals  accurate 
		Double d = 3.1415988888888888888999; 
		           
		Boolean bolean = false;
				
		  if(bolean) {
			  System.out.println("float values "+f);
			
		  }
		  System.out.println("double value "+d);
		
		  Character c ='9';
		  System.out.println(c);
	}

}
