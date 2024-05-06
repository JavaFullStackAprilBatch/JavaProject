package com.assignment.employeemangagement;

public class EmployeeManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager managerObj = new Manager();
		Developer developerObj = new Developer();
		Employee testerObj = new Tester();
		
		managerObj.name = "Manager one";
		developerObj.name = "Developer one";
		testerObj.name = "Tester one";
		
		managerObj.id = 10;
		developerObj.id = 11;
		testerObj.id = 12;
		
		managerObj.salary = managerObj.calculateSalary(70);
		developerObj.salary= developerObj.calculateSalary(45);
		testerObj.salary = testerObj.calculateSalary(30);
		
		Employee emp[]= new Employee[3] ;
		emp[0] = managerObj;
		emp[1] = developerObj;
		emp[2] =testerObj;
		
		Employee employee = new Employee();
		employee.displayDetails(emp);
	
	}

}
