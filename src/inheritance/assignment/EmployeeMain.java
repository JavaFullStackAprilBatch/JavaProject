package inheritance.assignment;

public class EmployeeMain {
    public static void main(String[] args) {
        Manager m=new Manager("Steven",112,50000);
        Developer d=new Developer("John",113,40000);
        Tester t=new Tester("Rachel",114,30000);
        m.displayDetails();
        d.displayDetails();
        t.displayDetails();

    }
}
