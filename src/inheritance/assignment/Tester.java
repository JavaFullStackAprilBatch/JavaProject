package inheritance.assignment;

public class Tester extends Employee {
    double bonus;
    Tester(String name, int id,double salary) {
        super(name, id);
        this.salary=salary;
        this.bonus=this.salary*10/100;
    }
    public void displayDetails() {

        System.out.println("Employee name :" +name + " Id :" +id  +" Salary :" +calculateSalary());
    }

    @Override
    public double calculateSalary() {

        return salary+bonus;
    }

}
