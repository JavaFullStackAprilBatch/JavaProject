package Inheritance;

public class Manager extends Employee{

	public Manager(String name, int id, double bsal) {
		super(name, id, bsal);
		// TODO Auto-generated constructor stub
		
	}
	public void calculatesalary() {
		super.calculatesalary();
		System.out.println("Manager Increment 15% : " + (esalary + esalary * 0.15));
	}
    public void displayDetails() {
    	System.out.println("manager details");
    	super.displayDetails();
    	this.calculatesalary();
    }
	
}
