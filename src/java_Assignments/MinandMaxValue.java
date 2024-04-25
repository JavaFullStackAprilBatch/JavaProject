package java_Assignments;

public class MinandMaxValue {

	int max = Integer.MIN_VALUE;
	int min = Integer.MAX_VALUE;

	public void maximum(int num[]) {

		for (int i = 0; i < num.length; i++) {

			if (num[i] > max) {
				max = num[i];

			}

		}
		System.out.println(max);

	}

	public void minimum(int num[]) {
		for (int i = 0; i < num.length; i++) {

			if (num[i] < min) {
				min = num[i];

			}

		}
		System.out.println(min);

	}

}