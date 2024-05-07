package oopsassignment;

public class EmployeeMain {

	public static void main(String[] args) {
		Manager m1 =new Manager("ABC", 101, 10000 );
		 Tester  t1 = new Tester("MNO", 102, 200000);
		 Developer d1 = new Developer("XYZ", 103, 30000);
		 
			System.out.println("Manager Details :"); 
			m1.displayDetails();
			System.out.println(".................");
			
		    System.out.println("Tester Details :");
		    t1.displayDetails();
		    System.out.println(".................");
			
		    
		    System.out.println("Developer Details :");
	        d1.displayDetails();
	        System.out.println(".................");
			

	}

}
