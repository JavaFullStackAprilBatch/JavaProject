package oopassignments.EMS_Inheritance;

public class Manager extends Employee {
	
    public Manager(String name, String id, double salary) {
        super(name, id, salary);
    }
	
	public double calculateSalary() {
		return salary + (salary*0.2);
	}
}
