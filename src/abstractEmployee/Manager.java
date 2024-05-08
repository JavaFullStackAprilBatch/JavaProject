package abstractEmployee;

public class Manager extends EmployeeAbstract {
    Manager(int id, String name, double salary, String department) {
        super(id, name, salary, department);
    }

    @Override
    void displayDetails() {
        System.out.println(name + " " + department+ " " + netSalary);

    }
}
