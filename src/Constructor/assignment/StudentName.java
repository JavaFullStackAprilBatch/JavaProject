package Constructor.assignment;

public class StudentName {
	String name;
	public StudentName() {
		name="unknown";
		System.out.println("name is: "+name);
		
	}
    public StudentName(String name) {
    	this.name=name;
    	System.out.println("name is: "+name);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentName s1=new StudentName();
		StudentName s2=new StudentName("Siri");
		StudentName s3=new StudentName();
		StudentName s4=new StudentName("Hari");
         
	}

}
