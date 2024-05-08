package Inheritanceassignment;

public class Manager extends Employee {
	public Manager(int id,String name,int hours,double rate) {
		super(id,name,hours,rate);
	}
	public void calculateSalary() {
	    super.calculateSalary();
	    System.out.println("With Manager Bonus Total Salary:"+(salary+salary*0.5));
	    
	    

}
public void displayDetails() {
	System.out.println("/nEmployee role is Manager");
	super.displayDetails();
	this.calculateSalary();
	
}
}


