package com.asssignment.AbstractEmployee;

public class Manager extends AbstractEmployee {

	public double calculateSalary() {
		this.salary = 70 * 8 * 260;
		return this.salary;
		
	}
	public void displayDetails(AbstractEmployee emp) {
		
		System.out.println("\nFrom Manager \nEmployee name : "+emp.name +"\nEmplyee id : #"+emp.id+"\nEmployee Salary : $"+emp.salary);
	
	}
}
