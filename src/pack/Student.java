package pack;

public class Student {
	String x = "Ben";
	String y = "Chen";
	
	public Student() {
		this.x = "Unknown";
		
	}
	public Student(String name) {
		this.y = name;
		
	}
public static void main(String[]a) {
	Student m = new Student();
	Student m2 = new Student("len");
	String z= m.x;
	String u = m2.y;
	
	System.out.println("Student 1 : " + z);
	System.out.println("Student 2 : " + u);
	
	
}
}
