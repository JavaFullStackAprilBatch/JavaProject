package assignment;

public class Employee {
	
	 String name;
	     int id;
	     double salary;

	    public Employee(String name, int id, double salary) {
	        this.name = name;
	        this.id = id;
	        this.salary = salary;
	    }

	    public double calculateSalary() {
	        // Base implementation can be overridden by subclasses
	        return salary;
	    }

	    public void displayDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("ID: " + id);
	        System.out.println("Salary: $" + salary);
	    }  
	    

	public static void main(String[] args) {
		 Manager m= new Manager("Manager",2354,100000,50);
		 m.calculateSalary();
		 m.displayDetails();
		 Developer d=new Developer("Developer",26842,10000,20);
		 d.calculateSalary();
		 d.displayDetails();
		 
		 Tester t=new Tester("Tester",2754,10000,20);
		 t.calculateSalary();
		 t.displayDetails();
		 
	}
	}	
		/* static String name;
}		 static int id;
		 static Double salary;
		 
		 public void calculateSalary() {
			System.out.println("Salary"); 
		 }
         public void displayDetails() {
        	 System.out.println("Display Details");
         }
         
         public static void main(String[] args) {
    		 Manager m= new Manager();
    		 Developer d=new Developer();
    		 Tester t=new Tester();
    		 
   //  m.calculateSalary(salary);
   //  m.displayDetails(name, id, salary);
     //d.calculateDeveloperSalary();
    // t.calculateTesetrSalary();
    	}*/
	
	
         
        

