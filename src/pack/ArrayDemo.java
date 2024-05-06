package pack;

import java.util.Arrays;
import java.util.ArrayList; 
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   int a[]= {10,20,30,40,50};
	   
	   Arrays.sort(a);
	   int min=a[0];
	   int max=a[a.length-1];
	   System.out.println("Max:"+max);
	   System.out.println("Min:"+min);
  // add an element in to array
	   Integer b[]= {2,3,4,6,8};
	   System.out.println("Array:"+Arrays.toString(a));
	   ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(b));
	   arrayList.add(20);
	   b=arrayList.toArray(b);
	   System.out.println("Array after adding element"+Arrays.toString(b));
	}

}
