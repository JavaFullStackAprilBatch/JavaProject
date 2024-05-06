package com.asssignment.AbstractEmployee;

public class Developer extends AbstractEmployee {
	
	public double calculateSalary() {
		this.salary = 45 * 8 * 260;
		return this.salary;
		
	}
	public void displayDetails(AbstractEmployee emp) {
		
		System.out.println("\nFrom Developer \nEmployee name : "+emp.name +"\nEmplyee id : #"+emp.id+"\nEmployee Salary : $"+emp.salary);
	
	}
}
