package Abstraction;

public class Manager extends Employee {
	double bonus;

	public Manager(String name, double salary, double bonus) {
		super(name, salary);
		this.bonus=bonus;
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculatesalary() {
	
		 return salary+bonus;
	}

	@Override
	public void displaydetails() {
		System.out.println("manager name::::"+name);
		System.out.println("managervsalary:::"+salary);
		System.out.println("bonus is :::"+bonus);
		System.out.println("TOTAL SALARY IS::"+calculatesalary());
	
		
	}

}
