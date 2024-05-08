package abstractEmployee;

public abstract class EmployeeAbstract {
    String name;
    int id;
    double salary;
    double netSalary;
    String department;
    EmployeeAbstract(int id, String name, double salary, String department) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
    }


    abstract void displayDetails();

    void calculateSalary(double pfPercentage) {
        double pfAmount = salary * (pfPercentage / 100);
        netSalary = salary - pfAmount;
    }
}