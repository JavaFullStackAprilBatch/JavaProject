// class to implement Constructor Overloading
package constrpack;

public class Student {
	String name;
	int age;
	String dob;
	
	//Default Constructor
	Student(){
		this.name = "Ajitha";
		this.age = 30;
		this.dob = "13-Aug-1998";
	}
	
	//Parameterised Constructor
	Student(String name, int age, String dob){
		this.name = name;
		this.age = age;
		this.dob = dob;
	}
	
	//Copy Constructor
	Student(Student Obj){
		this.name = Obj.name;
		this.age = Obj.age;
		this.dob = Obj.dob;
	}
	
	

}
