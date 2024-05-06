package Inheritance;

public class Tester extends Employee {

	public Tester(String name, int id, double bsal) {
		super(name, id, bsal);
		// TODO Auto-generated constructor stub
	}
	
	
	public void calculatesalary()
	{
		System.out.println("\"TEster Increment 5% : \" + (esalary + esalary * 0.5)");
	}
	public void displayDeatails()
	{
		System.out.println("Tester details");
    	super.displayDetails();
    	this.calculatesalary();
	}

}
