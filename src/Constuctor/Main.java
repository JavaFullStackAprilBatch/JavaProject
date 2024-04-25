package Constuctor;

public class Main {
	
	public static void main(String a[])
	{
		//creating object
		Student s1=new Student();
		Student s2=new Student("savita");
		Student s3=new Student("paresh");
		
		System.out.println(" student 1:"+s1.getName());
		System.out.println("student 2:"+s2.getName());
		System.out.println("student 3:"+s3.getName());
	}

}
