package pack;

public class AddingToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int newArray[]=new int[100];
		
		for (int i=1;i<=50;i++) {
			newArray[i-1]= i;
			System.out.println(newArray[i-1]);

		}
	}

}
