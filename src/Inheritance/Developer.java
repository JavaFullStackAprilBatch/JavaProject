package Inheritance;

public class Developer extends Employee {

	public Developer(String name, int id, double bsal) {
		super(name, id, bsal);
		// TODO Auto-generated constructor stub
	}
	
	public void calculateSalary() {
		super.calculatesalary();
		System.out.println("Developer Increment 10% : " + (esalary + esalary * 0.10));	
	}
	
	public void displayDetails() {
		System.out.println("developer detais" );
		super.displayDetails();
		this.calculateSalary();
		
	}

}
