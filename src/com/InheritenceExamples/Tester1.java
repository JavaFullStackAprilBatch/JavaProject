package com.InheritenceExamples;

public class Tester1 extends Employee1 {
    int salary;
    Tester1(String name, int id,int salary) {
        super(name, id);
        this.salary= salary;
    }
    public void calculateSalary() {
        System.out.println("Employee salary: " + salary);
    }

}
