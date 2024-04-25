package pack;

import java.util.HashSet;
import java.util.*;

//import java.util.Arrays;

public class MultiDimentionArray {

	public static void main(String[] args) {
		
		//Simple Array with hard coded values
		System.out.print("Simple Array with hard coded values\n");
		int num1[] = {1,2,3,4,5};
		{
			for (int i=0; i<5; i++) {
				System.out.println(num1[i]);
			}
		}
		
		
		//Multi-Dimentional Array with default values
		System.out.print("Multi-Dimentional Array with default values\n");
		int num2[][] = new int [2][4];
		for (int x=0; x<2; x++) {
			for(int y=0; y<4; y++) {
				System.out.print(num2[x][y] + " ");
			}
			System.out.println();
		}
		
		//Multi-Dimentional Array with Random values
		System.out.print("Multi-Dimentional Array with Random values\n");
		int num3[][] = new int [2][4];
		for (int x=0; x<2; x++) {
			for(int y=0; y<4; y++) {
				num3[x][y] = (int)(Math.random()*10);
			}
		}
		for (int x=0; x<2; x++) {
			for(int y=0; y<4; y++) {
				System.out.print(num3[x][y] + " ");
			}
			System.out.println();
		}
		
		//Find Largest number in an Array
		System.out.print("Find Largest number in an Array........\n");
		int num4[] = {2,13,7,1,5,15,11,3};
		int largest = num4[0];
		for (int m=0; m<num4.length; m++) {
			if(num4[m] > largest) {
				largest = num4[m];
			}
		}
		System.out.print("Larget Number is : " + largest);
		System.out.println();
		
		//Find Smallest number in an Array
		System.out.print("Find Smallest number in an Array........\n");
		int num5[] = {2,13,7,1,5,15,11,3};
		int smallest = num5[0];
		for (int m=0; m<num4.length; m++) {
			if(num5[m] < smallest) {
				smallest = num4[m];
			}
		}
		System.out.print("Smallest Number is : " + smallest);
		System.out.println();
		
	    //Remove Duplicates from an unsorted Array.
	    int arr[] = { 1 , 3 , 3 , 2 , 2 , 2 , 1 , 6 , 5 , 4, 6, 4 };
	    HashSet<Integer> hs = new HashSet<Integer>();
	    
	    for (int i=0; i < arr.length; i++) {
	    	hs.add(arr[i]);
	    }
	    System.out.println("Array without Duplicates: " + hs);
	    
	    
	    //Insert an element into a specific position in an Array
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Initialize size of Array: ");
	    int n = sc.nextInt();
	    System.out.println("Insert Array elements: ");
	    int a[] = new int [n+1];
	    for(int i=0; i<n; i++) {
	    	a[i]=sc.nextInt();
	    }
	    System.out.println("Insert new element to add: ");
	    int z=sc.nextInt();
	    System.out.println("Which position you want to add the new element: ");
	    int pos = sc.nextInt();
	    
	    for(int i=n; i>=pos; i--) {
	    	a[i]=a[i-1];
	    }
	    a[pos-1]=z;
	    System.out.println("Array with newly added element: ");
	    for(int i=0; i<=n; i++) {
	    	System.out.print(" " + a[i]);
	    }
	}

}
