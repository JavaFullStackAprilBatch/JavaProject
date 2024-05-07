package Arrays;

public class MaxandMinValue {

	public static void main(String[] args) {
	
		int a[] = {10,30,60,45,28,25,1,200,201};
		
		int min=a[0];
	    for(int i=1;i<a.length;i++)
		
		{
			if(a[i]<min)
			min=a[i];
				
       }
		
		int max=a[0];
		
		for(int j=1;j<a.length;j++)
		if(a[j]>max)
		{
			max=a[j];
		}
			
		
	
	System.out.println("the minimum value :" +min);
	
	System.out.println("the maximum value :" +max);

}
}