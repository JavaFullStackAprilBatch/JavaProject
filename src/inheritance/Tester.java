package javaproj.assignment.inheritance;

public class Tester extends Employee{
	public Tester(String n, int i, double s) {
		super(n,i,s);
	}
	
	public void calculateSalary() {
		super.calculateSalary();
		System.out.println("Tester Increment 5% : " + (eBasicSalary + eBasicSalary * 0.05));	
	}
	
	public void displayDetails() {
		System.out.println("\n\nTESTER");
		super.displayDetails();
		this.calculateSalary();
	}

}
