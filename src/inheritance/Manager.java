package javaproj.assignment.inheritance;

public class Manager extends Employee {
	public Manager(String n, int i, double s) {
		super(n,i,s);
	}
	
	public void calculateSalary() {
		super.calculateSalary();
		System.out.println("Manager Increment 15% : " + (eBasicSalary + eBasicSalary * 0.15));	
	}
	
	public void displayDetails() {
		System.out.println("\n\nMANAGER");
		super.displayDetails();
		this.calculateSalary();
	}

}
