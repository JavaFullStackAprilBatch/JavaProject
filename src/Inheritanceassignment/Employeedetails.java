package Inheritanceassignment;

public class Employeedetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee(1,"Siri",240,200);
		e.calculateSalary();
		e.displayDetails();
        Developr d=new Developr(2,"rekha",240,500);
        
        d.displayDetails();
        Manager m=new Manager(3,"Sri",240,700);
        m.displayDetails();
        Tester t=new Tester(4,"Hari",240,300);
        t.displayDetails();
	}

}
