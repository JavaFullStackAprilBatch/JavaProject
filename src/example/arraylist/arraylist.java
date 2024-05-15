package example.arraylist;

import java.util.ArrayList;
import java.util.List;

public class arraylist {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
	
		
		list.add("Green");
		list.add("Black");
		list.add("Brown");
		list.add("Orange");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		

		list.remove(1);//remove only the specified  element
		
		System.out.println(list);
		
		list.add(1,"Purple");//adding element using index
		list.add(2,"Pink");
		
		System.out.println(list);
		
		if(list.contains("Red"))//contains mtd - to check whether that element is present / not
			System.out.println("Yes");
		else
			System.out.println("No");
		//list.clear();// clear mtd - to clear all the elements
		System.out.println(list);
		
		list.set(4,"Yellow");//set mtd- to replace the element in the specified index
		
		System.out.println(list);
		
		//list.ensureCapacity(6);
		
	}
	
	
	

}
