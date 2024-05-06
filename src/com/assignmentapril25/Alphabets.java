package com.assignmentapril25;

public class Alphabets {
	public void letters() {
		
		for(int i=65;i<=90;i++) {
			System.out.println( Character.toString(i));
		}
	}

	public static void main(String[] args) {
		Alphabets obj=new Alphabets();
		obj.letters();
		

	}

}
