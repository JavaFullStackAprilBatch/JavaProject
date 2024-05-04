package oopassignments.EMS_Inheritance;

public class Employee {
	
	String name;
	String id;
	double salary;
	
	public Employee(String name, String id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public double calculateSalary() {
		return salary;
	}
	
	public void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
		System.out.println("Base Salary: $" + salary);
	}

}
