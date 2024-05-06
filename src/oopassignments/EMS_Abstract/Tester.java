package oopassignments.EMS_Abstract;

public class Tester extends Employee {
	
    public Tester(String name, String id, double salary) {
        super(name, id, salary);
    }
	
    @Override
	public double calculateSalary() {
		return salary + (salary*0.05);
	}

}
