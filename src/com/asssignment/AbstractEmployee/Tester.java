package com.asssignment.AbstractEmployee;

public class Tester extends AbstractEmployee {
	
	public double calculateSalary() {
		this.salary = 30 * 8 * 260;
		return this.salary;
		
	}
	public void displayDetails(AbstractEmployee emp) {
		
		System.out.println("\nFrom Tester \nEmployee name : "+emp.name +"\nEmplyee id : #"+emp.id+"\nEmployee Salary : $"+emp.salary);
	
	}
}
