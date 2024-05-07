package abstraction.assignment;

public class Manager extends Employee {
    double bonus;
    double salary;

    Manager(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
        this.bonus = this.salary * 20 / 100;
    }

    public Manager() {
        super();
    }

    @Override
    public void displayDetails() {
        System.out.println("Employee name :" + name + " Id :" + id + " Salary :" + calculateSalary());
    }


    @Override
    public double calculateSalary() {
        return (salary + bonus);


    }
}
