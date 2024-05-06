package oopassignments.EMS_Inheritance;

public class Tester extends Employee {
	
    public Tester(String name, String id, double salary) {
        super(name, id, salary);
    }
	
	public double calculateSalary() {
		return salary + (salary*0.05);
	}
}
