package javaproj.assignment.abstractcl;

public abstract class Employee {
	private String ename;
	private int eid;
	private double eBasicSalary;
	public Employee(String name, int id, double bSalary) {
		this.ename = name;
		this.eid = id;
		this.eBasicSalary = bSalary;
	}
	
	public String getName() {
		return this.ename;
	}
	
	public int getId() {
		return this .eid;
	}
	
	public double getBasicSalary() {
		return this.eBasicSalary;
	}
	
	public abstract void calculateSalary() ;
	public abstract void displayDetails()  ; 

}
