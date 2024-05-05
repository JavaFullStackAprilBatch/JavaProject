package javaproj.assignment.abstractcl;

public class Tester extends Employee{
	public Tester(String n, int i, double s) {
		super(n,i,s);
	}
	
	public void calculateSalary() {
		double eBasicSalary = getBasicSalary();
		System.out.println("Tester Increment 5% : " + (eBasicSalary + eBasicSalary * 0.05));	
	}
	
	public void displayDetails() {
		System.out.println("\n\nTESTER");
		System.out.println("Name: "+ getName() + "\nEmployee ID: " + getId() );
		calculateSalary();
	}

}
