package constructors;

public class StudentMain {

	public static void main(String[] args) {
		
		Student stu1=new Student();
		//stu1.getName();	
		System.out.println("first student name is:" +stu1.getName());
		
		
		Student stu2=new Student("Sowjanya");
		//stu2.getName();
		System.out.println("first student name is:" +stu2.getName());
		
		

	}

}
