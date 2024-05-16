package assignmentarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Employee {
	
	private String name;
	private String country;
	
	public Employee(String name,String country){
		
		this.name=name;
		this.country=country;
	}
	
	public String getName() {
		return name;
	}
	public String getCountry() {
		return country;
	}
	public String toString() {
		return "Employee{" +  "name='" + name +  '\'' + ", country='" + country + '\'' + '}';
	}

	public static void main(String[] args) {
		
	ArrayList<Employee> employee=new ArrayList<Employee>();
	
	employee.add(new Employee("raam","USA"));
	employee.add(new Employee("karthik","canada"));
	employee.add(new Employee("john","USA"));
	employee.add(new Employee("seetha","UK"));	
	employee.add(new Employee("divya","USA"));
	
   
	
	System.out.println("employee list before sort ");
	for(Employee emp:employee) {
		System.out.println(emp);
	}
	Collections.sort(employee, Comparator.comparing(Employee::getCountry));
    System.out.println("\nEmployees sorted by country Name:");
    for (Employee emp : employee) {
        System.out.println(emp.getName() + " - " + emp.getCountry());
    }

}
}