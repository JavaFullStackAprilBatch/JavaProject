package Inheritanceassignment;

public class Developr  extends Employee{
	public Developr(int id,String name,int hours,double rate) {
		super(id,name,hours,rate);
	}
	public void calculateSalary() {
	    super.calculateSalary();
	    System.out.println("With Devloper Bonus Total Salary:"+(salary+salary*0.2));
	    
	    

}
public void displayDetails() {
	System.out.println("/nEmployee role is Developer");
	super.displayDetails();
	this.calculateSalary();
	
}
}