package javaproj.assignment.abstractcl;


public class EmployeeMain {
	public static void main(String args[]) {
		Developer d = new Developer("Raj", 2345, 150000);
		d.displayDetails();
		Manager m = new Manager("Harsh",1336,200000);
		m.displayDetails();
		Tester t = new Tester("Anush", 9876, 100000);
		t.displayDetails();
		Employee e1 = new Manager("Bryan",7845, 2500000);
		e1.displayDetails();
		Employee e2 = new Developer("Aryan",17845, 212121);
		e2.displayDetails();
		Employee e3 = new Tester("Kryan",78452, 121212);
		e3.displayDetails();
	}

}
