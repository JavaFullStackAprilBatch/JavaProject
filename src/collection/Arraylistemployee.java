
// 

package collection;

import java.util.ArrayList;
import java.util.List;

public class Arraylistemployee {
	
	public static void main(String args[])
	{
		List<Employee> employee=new ArrayList<Employee>();
		employee.add(new Employee("savita",30,"USA"));
		employee.add(new Employee("paresh",55,"uk"));
		employee.add(new Employee("john",60,"canada"));
		employee.add(new Employee("abc",37,"USA"));
		employee.add(new Employee("xyz",63,"india"));
		
		//employee whose age >50
		
		System.out.println("\n employee with age is more than 50");
		for(Employee employee1:employee)
		{
			if(employee1.getAge()>50) {
				
				System.out.println(employee1.getName());
				
			}
		}
		
		//remove employees
		
		System.out.println("\n employees after remove who resides USA ");
		employee.removeIf(employee1->"USA".equals(employee1.getCountry()));
		for(Employee employee1:employee) {
			System.out.println(employee1.getName());
		}
        //sort employee by country
		
		System.out.println("\n employee sorted by country");
		employee.sort((e1,e2)->e1.getCountry().compareTo(e2.getCountry()));
		for(Employee employee1:employee) {
			System.out.println(employee1.getName()+ employee1.getCountry());
		}
		
		
	}

}
