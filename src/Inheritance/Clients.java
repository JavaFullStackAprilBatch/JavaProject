package Inheritance;

public class Clients {
	
	public static void main(String a[])
	{
		Employee e1 = new Employee("savita", 111,20000);
		e1.displayDetails();
		e1.calculatesalary();
		
		Manager m=new Manager("aaaa",222,18000);
		m.displayDetails();
		m.calculatesalary();
		
		Developer d=new Developer("bbbb",333,12000);
		d.displayDetails();
		d.calculatesalary();
		
		Tester t=new Tester("cccc",444,10000);
		t.displayDeatails();
		t.calculatesalary();
		
		Employee e2=new Manager("ddd",555,22000);
		e2.displayDetails();
		
		
		
		
		
	}

}
