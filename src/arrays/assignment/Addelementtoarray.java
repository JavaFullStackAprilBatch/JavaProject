package arrays.assignment;

public class Addelementtoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating Array object
		int a[] = new int[20];
		//Assigning elements to array
		for(int i=0;i<a.length-1;i++) {
			a[i]=i+5;
			
		}
		a[a.length-1]=100;
		//display array
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i] +"");
		}

	}

}
