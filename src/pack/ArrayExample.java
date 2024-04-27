package pack;

public class ArrayExample {
	public static void main(String a[]) {
		int k = 20;
		int j;
		j = 80;
		int u = 90; 
		char c = 's';
		double d = 5.6;
		

		
		
		int z[] = {50, 60 ,70 ,80 ,90,80,90};  //z.lenght =  5
		
		
		
		
		int sub[] = new int[z.length]; //7 
	
		int total= 0;
		
		for(int i = 0 ;i<=sub.length-1;i++)
		{
			sub[i] = z[i];
			System.out.println(sub[i]);
			
			total = total+sub[i];
			
		}
		System.out.println("Total values "+total);

		
			
			
		
	
		

		
		
		
//		 i = 0    0<5
//	     i = 1    1<5
//	     i= 2     2<5
//	     i =3     3<5
//	     i = 4    4<5
//	     i=5      5<5
		
		
//		for(int i=0; i < z.length ; i++)
//		{
//		    	System.out.println(z[i]);  // 50  60  70  80   90
//		}
//		
		
		
		
		
		
		
		
	}

}
