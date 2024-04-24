package Arrays;

public class AddElements {

	public static void main(String[] args) {
		
		 int arr[] = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10};
		 
	        for (int i = 0; i <arr.length; i++) 
	        {
	            arr[i] = i + 1;
	            System.out.println(arr[i]);

	        }
	        
	       
	        
	        arr[arr.length-1] = 50;
	      
	        for (int i = 0; i < arr.length; i++) 
	        {
	            System.out.print(arr[i] + " ");
	        }
	    }
	
	}


