package com.InheritenceExamples;

public class Manager1 extends Employee1 {
    int salary;

    Manager1(String name, int id, int salary) {
        super(name, id);
        this.salary = salary;
    }

    public void calculateSalary() {
        System.out.println("Employee salary: " + salary);
    }
}
