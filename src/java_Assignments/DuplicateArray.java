package java_Assignments;

import java.util.Arrays;

public class DuplicateArray {
	

	public static void main(String[] args) {
		int duplicateArray[]= {1,2,2,3,4,4,4,5,5};
		int newArr[]=new int[duplicateArray.length];
		int j=0;
		
		for(int i=0;i<duplicateArray.length;i++) { 
			if(i==duplicateArray.length-1|| duplicateArray[i]!=duplicateArray[i+1]) {
				newArr[j]=duplicateArray[i];
				j++;
			}
		}
		int deDupArr[]=new int[j];
		for(int k=0;k<j;k++) {
			deDupArr[k]=newArr[k];
			
		}
		System.out.println( Arrays.toString(deDupArr));


	}

}
