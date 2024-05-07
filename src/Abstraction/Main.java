package Abstraction;

public class Main {
	public static void main(String a[])
	{
		Employee devloper=new Developer("savi",10000, 3);
		Employee manager=new Manager("paresh",20000,5000);
		Employee tester=new Tester("patil", 8000,5);
		
		manager.displaydetails();
		
		System.out.println("----------");
		
		devloper.displaydetails();
		
		System.out.println("----------");
		
		tester.displaydetails();
		
	}

}
