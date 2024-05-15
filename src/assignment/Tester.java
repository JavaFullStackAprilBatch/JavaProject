package assignment;

public class Tester  extends Employee{
	
	private double projectCompletionBonus;

    public Tester(String name, int id, double salary,double projectCompletionBonus) {
        super(name, id, salary);
       this.projectCompletionBonus = projectCompletionBonus;
    }

    @Override
    public double calculateSalary() {
        // Tester's salary includes project completion bonus
        return super.calculateSalary() + projectCompletionBonus;
    }
}
	
	/*public void calculateTesetrSalary() {
		System.out.println("Tester salary");
	}
	
	 public void displayTesterDetails() {
    	 System.out.println("Display  Tester Details");
     }*/


