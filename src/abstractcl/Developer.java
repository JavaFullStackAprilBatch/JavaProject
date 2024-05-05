package javaproj.assignment.abstractcl;

public class Developer extends Employee{
	public Developer(String n, int i, double s) {
		super(n,i,s);
	}
	
	public void calculateSalary() {
		double eBasicSalary = getBasicSalary();
		System.out.println("Developer Increment 10% : " + (eBasicSalary + eBasicSalary * 0.1));	
	}
	
	public void displayDetails() {
		System.out.println("\n\nDEVELOPER");
		System.out.println("Name: "+ getName() + "\nEmployee ID: " + getId() );
		calculateSalary();
	}

}
