package Typecasting;

import java.util.Scanner;

public class Inttostring {
	
	  public static void main(String[] args) {
		  
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter an integer number:");
	        int n =sc.nextInt();
	        
	        
	        String st = Integer.toString(n);  //string to integer
	        
	        System.out.println("converting input integer to string :"+ st);
	    }
	}

