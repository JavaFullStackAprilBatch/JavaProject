package abstractEmployee;

public class EmployeeMain {
    public static void main(String[] args) {


        Developer dev = new Developer(101, "Aswini", 12000, "Java");
        Manager man = new Manager(201, "nagu", 15000, "Management");
        Tester tes = new Tester(401, "Vihan", 9000, "Testing");


        dev.calculateSalary(5);
        tes.calculateSalary(2);
        man.calculateSalary(10);

        dev.displayDetails();
        man.displayDetails();
        tes.displayDetails();


    }
}
