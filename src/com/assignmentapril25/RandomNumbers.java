package com.assignmentapril25;

import java.util.Random;

public class RandomNumbers {
	public void random() {
		Random random = new Random();
		// for(;true;)
		while (true) {

			int r = random.nextInt(1, 10);
			System.out.println(r);

			if (r == 5)
				break;

		}
	}

	public static void main(String[] args) {
		RandomNumbers obj = new RandomNumbers();
		obj.random();

	}

}
