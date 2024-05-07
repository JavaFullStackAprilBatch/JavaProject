package abstraction.assignment;

public class Developer extends Employee {
    double bonus;
    double salary;

    public Developer(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
        this.bonus = this.salary * 10 / 100;
    }

    public Developer() {

        super();
    }

    @Override
    public void displayDetails() {
        System.out.println("Employee name :" + name + " Id :" + id + " Salary :" + calculateSalary());
    }

    @Override
    public double calculateSalary() {
        return salary + bonus;
    }
}





















