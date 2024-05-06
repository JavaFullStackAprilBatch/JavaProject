package oopassignments.EMS_Abstract;

public class Developer extends Employee {

    public Developer(String name, String id, double salary) {
        super(name, id, salary);
    }
	
    @Override
	public double calculateSalary() {
		return salary + (salary*0.1);
	}
}
