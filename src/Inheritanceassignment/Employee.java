package Inheritanceassignment;

public class Employee {
	String name;
	int id;
	double salary;
	double rate;
	int hours;
	public Employee(int empid,String ename,int hours,double rate){
	this.id=empid;
	this.name=ename;
	this.hours=hours;
	this.rate=rate;
	}
	public void calculateSalary() {
		this.salary=this.rate*this.hours;
		System.out.println("Basic Salary is"+this.salary);
		
		}
		
	
	public void displayDetails() {
		System.out.println("Employee details are:"+this.id +this.name);
		
	}
}
