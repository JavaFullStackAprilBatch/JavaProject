package com.assignmentapril25;

public class MutiplicationTable {
	public void table(int num) {
		System.out.println();

		for (int i = 0; i <= 10; i++) {
			System.out.printf("%d * %d = %d \n", num, i, num * i);

		}
	}

	public static void main(String[] args) {
		MutiplicationTable obj = new MutiplicationTable();
		obj.table(1);
		obj.table(5);
		obj.table(9);
		obj.table(12);

	}

}
