package employee;

public class Employee {
    Employee(int id, String name, double salary, String department) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
    }

    String name;
    int id;
    double salary;
    double netSalary;
    String department;

    void calculateSalary(double pfPercentage) {
        double pfAmount = salary * (pfPercentage / 100);
        netSalary = salary - pfAmount;


    }

    String displayDetails() {

        return name + " " + department+ " " + netSalary;


    }


}

