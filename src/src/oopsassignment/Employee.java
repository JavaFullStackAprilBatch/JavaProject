package oopsassignment;

public class Employee {
	String name ;
	int id;
	int salary ;
	
	
	public Employee(String name,int id,int salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
		}
	
	public double CaluculateSalary()
	{
	
		return salary;
		
	}
	public void displayDetails() 
	{
		System.out.println("Name of the Employee :" +name);
		System.out.println("Employee ID :"+id);
		System.out.println("Employee salary :"+CaluculateSalary());
		
	}
}
	
	class Manager extends Employee
	{

		public Manager(String name, int id, int salary) 
		{
			super(name, id, salary);
			
	    }
		public double CaluculateSalary()
		{
			return salary+(0.1*salary);
		}
	}
		
     class Developer extends Employee
     {

		public Developer(String name, int id, int salary) 
		{
			super(name, id, salary);
			
		}
		public double CaluculateSalary()
		{
			return salary+(0.2*salary);
		}
     }
			
	 class 	Tester extends Employee
	 {

		public Tester(String name, int id, int salary) 
		{
			super(name, id, salary);
			
		}
		public double Caluculatesalary()
		{
			return salary+(0.3*salary);
			
		}
		
		
		}
	 
	 
     
     
     
     
   
    	 
     
	

		
		

	
	

	


