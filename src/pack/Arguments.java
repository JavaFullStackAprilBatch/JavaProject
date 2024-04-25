package pack;

public class Arguments {
	
	int y ;
	static int t ; 
	
	public int add(int a , int b, int t) {
		// int z = 50;  // local variables
		int sum = a+b+t;
		return sum;
  		
	}
	
	public static int sub(int a, int b) {
		
		return a-b+t;
	}
	public static int div(int a, int b)
	{
		return a/b+t;
	}

}
