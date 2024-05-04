package oopassignments.EMS_Inheritance;

public class Developer extends Employee {
	
    public Developer(String name, String id, double salary) {
        super(name, id, salary);
    }
	
	public double calculateSalary() {
		return salary + (salary*0.1);
	}
}
