package oopassignments.EMS_Inheritance;

public class Client {

	public static void main(String[] args) {
		
		Manager m = new Manager("Karen", "A123", 100000);
		Developer d = new Developer("Kavin", "A456", 80000);
		Tester t = new Tester("Jerry", "A789", 50000);
		
		System.out.println("Manager Details");
		m.displayDetails();
		System.out.println("Calculated Salary: $" + m.calculateSalary());
		System.out.println();
		
		System.out.println("Developer Details");
		d.displayDetails();
		System.out.println("Calculated Salary: $" + d.calculateSalary());
		System.out.println();
		
		System.out.println("Tester Details");
		t.displayDetails();
		System.out.println("Calculated Salary: $" + t.calculateSalary());
		System.out.println();
	}

}
