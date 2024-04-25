package arraysproj;
public class MinMax {
	public void minmax(int ar[],int n) {
		int max = ar[0], min = ar[0];
		for (int i = 1; i < n; i++) {
			if (ar[i] > max)
				max = ar[i];
			else if(ar[i]< min)
				min = ar[i];
		}
		System.out.printf("Max val = %d\nMin val =%d\n", max,min);
	}

}
