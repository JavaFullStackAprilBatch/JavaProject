package assignmentarraylist;


import java.util.ArrayList;

public class EmployeeNames {
	
	
	private   String name;
	private int age;
	
	public  EmployeeNames(String name, int age) {
		this.name=name;
		this.age=age;
		}
	
	public   String getName() {
		
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public static void main(String[] args) {
		ArrayList<EmployeeNames> emp=new ArrayList<EmployeeNames>();
		
		emp.add(new EmployeeNames("kavitha",35));
		emp.add(new EmployeeNames("divya",55));
		emp.add(new EmployeeNames("raam",40));
		emp.add(new EmployeeNames("sarala",56));
		emp.add(new EmployeeNames("ankitha",60));
		emp.add(new EmployeeNames("krishna",50));
		emp.add(new EmployeeNames("abc",34));
		
		System.out.println("employee names more than age 50 :");
		for(EmployeeNames employee:emp) {
			if(employee.getAge()>50) {
				System.out.println(employee.getName());
			}
				
				
			}
			
			
		}
		
		

	

}

	

	

