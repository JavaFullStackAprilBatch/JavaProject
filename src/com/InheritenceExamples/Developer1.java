package com.InheritenceExamples;

public class Developer1 extends Employee1 {
    int salary;

    Developer1(String name, int id, int salary) {
        super(name, id);
        this.salary = salary;
    }

    public void calculateSalary() {
        System.out.println("Employee salary: " + salary);
    }


}
