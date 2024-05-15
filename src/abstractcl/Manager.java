package javaproj.assignment.abstractcl;

public class Manager extends Employee{
	public Manager(String n, int i, double s) {
		super(n,i,s);
	}
	
	public void calculateSalary() {
		double eBasicSalary = getBasicSalary();
		System.out.println("Manager Increment 15% : " + (eBasicSalary + eBasicSalary * 0.15));	
	}
	
	public void displayDetails() {
		System.out.println("\n\nMANAGER");
		System.out.println("Name: "+ getName() + "\nEmployee ID: " + getId() );
		calculateSalary();
	}

}
