package constructor.assignment;

public class Student {
	String fName;
	String lName;

	public Student(String x, String y) {
		this.fName = x;
		this.lName = y;

	}

	public Student() {

	}
	public Student(String x) {
		this.fName = x;


	}
	
	public String fullName() {
		
		if(this.fName != null || this.lName != null) {
			String name = this.fName + " " + this.lName;
			return name;
		} else
		return "Unknown";
	}

	public static void main(String[] args) {

		Student s1 = new Student("Usman", "sssss");   //  s1  -- fname = "Usman" , lname = "ssss"
		Student s2 = new Student();  //s2  fname = null lname = null
		Student s3 = new Student("Usman");  //s3  fname = Usman  lName = null

		
		String n1 = s1.fullName();
		String n2 = s2.fullName();
		String n3 = s3.fullName();
		
		System.out.println("Studen name is: " + n1 );
		System.out.println("Studen name is: " + n2 );
		System.out.println("Studen name is: " + n3 );
	}
}
