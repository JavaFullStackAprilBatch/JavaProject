package pack;
public class StudentContrl {
    String fName;
    String lName;

    public StudentContrl() {
    }

    public StudentContrl(String c, String d) {
        this.fName = c;
        this.lName = d;
    }

    public String name() {
        if (this.fName != null && this.lName != null) {
            String name1 = this.fName + " " + this.lName;
            return name1;
        } else
            return "Unknown";
    }
    public static void main(String[] args) {
        StudentContrl st1 = new StudentContrl();
        String c1 = st1.name();
        System.out.println("student name is :"+ c1);

        StudentContrl st2 = new StudentContrl("sam", "ram");
        String c2 = st2.name();
        System.out.println("student name is :"+ c2);
    }

}
