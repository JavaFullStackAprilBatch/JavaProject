package assignmentarraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeUSA {
	
	private String name;
	private String country;
	
	
    public EmployeeUSA(String name,String country) {
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
		
		ArrayList<EmployeeUSA> employees=new ArrayList<EmployeeUSA>();
		
		employees.add(new EmployeeUSA("raam","USA"));
		employees.add(new EmployeeUSA("karthik","canada"));
		employees.add(new EmployeeUSA("john","USA"));
		employees.add(new EmployeeUSA("seetha","UK"));	
		employees.add(new EmployeeUSA("divya","USA"));
		
		System.out.println("employee list before removal");
		for(EmployeeUSA emp:employees) {
			System.out.println(emp);
			
		}
		
		
		Iterator<EmployeeUSA> iterator=employees.iterator();
		
		while(iterator.hasNext()) {
		EmployeeUSA	emp=iterator.next();
		
		if(emp.getCountry().equals("USA")) {
			
		iterator.remove();
			
		}
		}
		
		System.out.println("After removal  of resides in USA:");
		for(EmployeeUSA emp:employees) {
		System.out.println(emp);
			
		}
		
	    }

        }
