//set given an array of integers find the number of unique elements in the array using a hash set


package collection;

import java.util.HashSet;

public class Setassignment {
	public static void main(String args[])
	{
		int[] array = {1,2,3,4,4,6,7,7,8,9};
		HashSet<Integer> set =new HashSet<Integer>();
		
		for(int num:array)
		{
			try {
				set.add(num);
				
			}
			catch(Exception e){
				System.out.println("Duplicate elements"+num);
				
			}
		}
		System.out.println("\n unique elements ::"+set.size());
		
	}

}
