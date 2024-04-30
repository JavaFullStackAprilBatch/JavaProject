package pack;

import java.util.Scanner;
public class ConvertInttoString {
	
   int a;
 
   String b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any Number");
		Scanner r= new Scanner(System.in);
		int a= r.nextInt();
	    String b = String.valueOf(a);
	    
	    System.out.println("Using String.valueOf(a)" +b);
	}
 

}
