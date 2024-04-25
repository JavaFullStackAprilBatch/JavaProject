package java_Assignments;

import java.util.Arrays;

public class AddingElements {
	public static void main(String args[]) {
	int arr[] = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		int newArr[]= new int[arr.length+1];
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		newArr[newArr.length-1]=50;
		System.out.println(Arrays.toString(newArr));
		

	}
}
