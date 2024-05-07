package Abstraction;

public class Tester extends Employee{
	
	int workhour;

	public Tester(String name, double salary, int workhour) {
		super(name, salary);
		this.workhour=workhour;
	}

	@Override
	public double calculatesalary() {
		
		return 4000+(workhour*60);
		
	}

	@Override
	public void displaydetails() {
		
		System.out.println("Tester"+ name);
		System.out.println("salary:::"+ calculatesalary());
		
		
	}
	

}
