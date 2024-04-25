package pack;

public class ArrayAssigment3 {

	 public static void main(String[] args) {
	        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
	        
	        // Remove duplicate elements
	        int j = 0;
	        for (int i = 0; i < arr.length - 1; i++) {
	            if (arr[i] != arr[i + 1]) {
	                arr[j++] = arr[i];
	            }
	        }

	        // Print the unique elements
	        for (int i = 0; i < j; i++) {
	            System.out.println(arr[i]);
	        }
	    }
	}

