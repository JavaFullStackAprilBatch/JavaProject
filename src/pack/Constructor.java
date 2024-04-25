package pack;

public class Constructor {
	int x;
	int y;
	int z ;
	
	public Constructor() {
		this.x = 30;
		this.y = 60;
		
		
		
			
		
		
	}
	public int add() {
		int z = x +y;
		return z;
		
		
	}
	
	public static void main (String [] a) {
		Constructor m = new Constructor();
		Constructor m2 = new Constructor();
		int z = m.add();
		System.out.println("sum of x and y "+z);
		
		
		
	}
}
	
