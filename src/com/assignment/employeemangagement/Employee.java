package com.assignment.employeemangagement;

public class Employee {
	String name = "";
	int id =0 ;
	double salary = 0;
	
	public double calculateSalary(double hrRate) {
		this.salary = hrRate * 8 * 260;
		return salary;
		
	}
	
	public void displayDetails(Employee emp[]) {
		for (int i=0; i<emp.length;i++) {
			System.out.println("\nEmployee name : "+emp[i].name +"\nEmplyee id : #"+emp[i].id+"\nEmployee Salary : $"+emp[i].salary);
		}
	}
}
