package assignment;

public class Developer extends Employee {
	
   private double overtimePayRate;

    public Developer(String name, int id, double salary,double overtimePayRate) {
        super(name, id, salary);
        this.overtimePayRate = overtimePayRate;
    }

    @Override
    public double calculateSalary() {
       // Developer's salary includes overtime pay
        return super.calculateSalary() + (overtimePayRate * 40); // Assuming 40 hours of overtime
    }
}

	/*public void calculateDeveloperSalary() {
		System.out.println("Developer salary");
	}
	
	 public void displayDeveloperDetails() {
    	 System.out.println("Display  Developer Details");
     }*/
     

