package oopassignments.EMS_Abstract;

abstract class Employee {

	String name;
	String id;
	double salary;
	
	public Employee(String name, String id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public abstract double calculateSalary();
	
	public void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
		System.out.println("Base Salary: $" + salary);
	}
}
