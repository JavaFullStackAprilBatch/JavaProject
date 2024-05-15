package assignment;

public class Manager extends Employee {
	
	 private double bonus;

	    public Manager(String name, int id, double salary,double bonus) {
	        super(name, id, salary);
	        this.bonus = bonus;
	    }

	    @Override
	    public double calculateSalary() {
	        // Manager's salary includes a bonus
	        return super.calculateSalary()+ bonus ;
	    }
	
	/*public void calculateSalary(Double salary) {
		System.out.println("Manager salary:"+salary);
	}
	
	 public void displayDetails(String a,int b,Double salary) {
    	 System.out.println("Display  Manager Details:"+ "Name:"+a+"Id:"+b+"Salary:"+salary);
     }*/

}
