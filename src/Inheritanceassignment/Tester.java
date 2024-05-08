package Inheritanceassignment;

public class Tester extends Employee{
	public Tester(int id,String name,int hours,double rate) {
		super(id,name,hours,rate);
	}
	public void calculateSalary() {
	    super.calculateSalary();
	    System.out.println("With Tester Bonus Total Salary:"+(salary+salary*0.1));
	    
	    

}
public void displayDetails() {
	System.out.println("/nEmployee role is Tester");
	super.displayDetails();
	this.calculateSalary();
	
}
}


