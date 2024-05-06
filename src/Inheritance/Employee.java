package Inheritance;

public class Employee {
	
	String ename;
	int eid;
	double esalary;
	private double eSalary;
	
	public Employee(String name, int id, double bsal) {
		this.ename = name;
		this.eid = id;
		this.eSalary = bsal;
	}

	
	public void calculatesalary()
	{
		System.out.println("Employee Basic Salary: " + this.eSalary);	
	}
	
	public void displayDetails()  {
		System.out.println("Name: "+ this.ename + "\n Employee ID: " + this.eid );
	}


}
