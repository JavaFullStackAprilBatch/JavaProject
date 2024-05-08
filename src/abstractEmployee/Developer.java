package abstractEmployee;

public class Developer extends EmployeeAbstract {
  public  Developer(int id, String name, double salary, String department) {
        super(id, name, salary, department);
    }


    @Override
    void displayDetails() {
        System.out.println(name + " " + department+ " " + netSalary);

    }
}
