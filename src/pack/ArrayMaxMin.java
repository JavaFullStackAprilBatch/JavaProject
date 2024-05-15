package pack;

public class ArrayMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]= {5,73,8,3,10,36,2,67};
		int min=numbers[0],max=numbers[0];
		
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]>max) {
				max=numbers[i];
			}
//			else {
//				
//			}
		}
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]<min) {
				min=numbers[i];
			}
		}
		System.out.println("Maximum is "+max);
		System.out.println("Minimum is "+min);
	}

}
