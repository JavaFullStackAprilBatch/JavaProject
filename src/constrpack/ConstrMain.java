package constrpack;

public class ConstrMain {

	public static void main(String[] args) {
		
		
		Student s1 = new Student(); //invokes default constr
		Student s2 = new Student("Manju", 15, "5-Mar-2009");// invokes parameterised
		Student s5 = new Student("Ajitha", 30, "13-Aug-1998");
		Student s3 = s5; //invokes copy constr
		Student s4 = new Student(s2);// invokes copy constr
		
		System.out.printf("Default Constructor\nName: %s\n Age: %d\n Dob: %s\n", s1.name, s1.age, s1.dob);
		System.out.printf("Parameterised Constructor\nName: %s\n Age: %d\n Dob: %s\n", s2.name, s2.age, s2.dob);
		System.out.printf("Copy Constructor Method 1\nName: %s\n Age: %d\n Dob: %s\n", s3.name, s3.age, s3.dob);
		System.out.printf("Copy Constructor Method 2\nName: %s\n Age: %d\n Dob: %s\n", s4.name, s4.age, s4.dob);
		

	}

}
