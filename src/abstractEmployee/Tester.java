package abstractEmployee;

public class Tester extends EmployeeAbstract {
    Tester(int id, String name, double salary, String department) {
        super(id, name, salary, department);
    }

    @Override
    void displayDetails() {
        System.out.println(name + " " + department+ " " + netSalary);
    }
}
