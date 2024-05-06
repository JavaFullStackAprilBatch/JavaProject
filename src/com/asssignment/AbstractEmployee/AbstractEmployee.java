package com.asssignment.AbstractEmployee;

public class AbstractEmployee {
	String name = "";
	int id =0 ;
	double salary = 0;
	
	public double calculateSalary() {
		this.salary = 20 * 8 * 260;
		return salary;
		
	}
	
	public void displayDetails(AbstractEmployee emp[]) {
		for (int i=0; i<emp.length;i++) {
			System.out.println("\nEmployee name : "+emp[i].name +"\nEmplyee id : #"+emp[i].id+"\nEmployee Salary : $"+emp[i].salary);
		}
	}
	
	public void displayDetails(AbstractEmployee emp) {
	
			System.out.println("\nFrom Employee \n Employee name : "+emp.name +"\nEmplyee id : #"+emp.id+"\nEmployee Salary : $"+emp.salary);
		
	}
}
