package Abstraction;

public class Developer extends Employee {
	int experiance;

	public Developer(String name, double salary, int experiance) {
		super(name, salary);
		this.experiance=experiance;
		
	}

	@Override
	public double calculatesalary() {
		return 5000+(experiance*1000);
		
	}

	@Override
	public void displaydetails() {
		
		System.out.println("Devloper name::"+ name);
		System.out.println("salary::"+calculatesalary());
	}

}
