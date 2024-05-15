//package javaproj.assignment.inheritance;

public class Employee {
	String ename;
	int eid;
	double eBasicSalary;
	public Employee(String name, int id, double bsal) {
		this.ename = name;
		this.eid = id;
		this.eBasicSalary = bsal;
	}
	public void calculateSalary() {
		
			System.out.println("Employee Basic Salary: " + this.eBasicSalary);	
	}
	
	public void displayDetails()  {
		System.out.println("Name: "+ this.ename + "\nEmployee ID: " + this.eid );
	}

}
