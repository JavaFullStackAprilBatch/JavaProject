package com.asssignment.AbstractEmployee;

public class EmployeeManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractEmployee managerObj = new Manager();
		AbstractEmployee developerObj = new Developer();
		AbstractEmployee testerObj = new Tester();
		
		managerObj.name = "Manager one";
		developerObj.name = "Developer one";
		testerObj.name = "Tester one";
		
		managerObj.id = 10;
		developerObj.id = 11;
		testerObj.id = 12;
		

		managerObj.salary = managerObj.calculateSalary();
		managerObj.displayDetails(managerObj);
		
		developerObj.salary = developerObj.calculateSalary();
		developerObj.displayDetails(developerObj);
		
		testerObj.salary = testerObj.calculateSalary();
		testerObj.displayDetails(testerObj);
		
	
	}

}
