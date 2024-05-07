package abstraction.assignment;

public abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Employee() {

    }


    public abstract void displayDetails();

    public abstract double calculateSalary();
}

