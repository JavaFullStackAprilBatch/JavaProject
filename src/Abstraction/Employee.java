package Abstraction;

public abstract class Employee {
	
	String name;
	double salary;
	
	public Employee(String name,double salary) {
		
		this.name=name;
		this.salary=salary;
		
		}
	public abstract double calculatesalary();
	public abstract void displaydetails();
	
}
