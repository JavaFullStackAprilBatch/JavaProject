package oopassignments.EMS_Abstract;

public class Manager extends Employee {
	
    public Manager(String name, String id, double salary) {
        super(name, id, salary);
    }
	
    @Override
	public double calculateSalary() {
		return salary + (salary*0.2);
	}

}
