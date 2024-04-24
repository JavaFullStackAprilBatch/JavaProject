package pack;


public class DuplicateRemovalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,2,3,4,4,4,5,5};
		
		int[] newArray= new int[10];
		int temp=0;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i-1]==arr[i]) {
				//System.out.println(arr[i]);
			}
		else {
			newArray[temp]=arr[i];
			System.out.println(newArray[temp]);
			temp++;
		}
	}
		//System.out.println(newArray);
		
//		ArrayList<Integer> ar1= new ArrayList<Integer>();
	}
		
}
