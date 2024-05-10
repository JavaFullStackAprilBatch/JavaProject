package loopproj;

public class Multiplication {
	public void multi(int n) {
		System.out.printf("Multiplication Table for %d using For loop\n",n);		
		for (int i = 1; i<=15; i++)
			System.out.printf("%d  *  %d  = %d\n", i,n,i*n);	
		System.out.printf("Multiplication Table for %d using While loop\n",n);
		int i=1;
		while(i<=15) {
			System.out.printf("%d  *  %d  = %d\n", i,n,i*n);
			i++;
		}
	}

}
