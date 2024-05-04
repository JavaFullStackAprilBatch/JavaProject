package javaproj.assignment.inheritance;

public class EmployeeMain {
	public static void main(String args[]) {
		Employee e = new Employee("Sasi", 1234, 15000);
		e.displayDetails();
		e.calculateSalary();
		Developer d = new Developer("Raj", 2345, 150000);
		d.displayDetails();
		Manager m = new Manager("Harsh",1336,200000);
		m.displayDetails();
		Tester t = new Tester("Anush", 9876, 100000);
		t.displayDetails();
		Employee e1 = new Manager("Bryan",7845, 2500000);
		e1.displayDetails();
	}

}
