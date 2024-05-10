package arraysproj;
public class RemoveDuplicate {
	
	public void remdup(int ar[], int n) {
		
		int k =0, temp;
		
		//Sorted using bubble sort
		for(int i=0; i <n; i++)
			for(int j=0; j< n-1-i; j++)
				if(ar[j]< ar[j+1]) {
					temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}	
		
		//removing duplicate elements
		for(int i = 0; i < n-1; i++) 
				if (ar[i] != ar[i+1]) 
					ar[k++] = ar[i];
		ar[k++] = ar[n-1];	
		
		// printing the array			
		System.out.println("Array after deleting duplicate values:");
		for (int kl =0; kl < k; kl++)
			System.out.println(ar[kl]);
			
	}

}
