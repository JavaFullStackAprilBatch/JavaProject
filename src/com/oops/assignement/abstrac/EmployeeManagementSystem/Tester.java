package com.oops.assignement.abstrac.EmployeeManagementSystem;

public class Tester extends Employee{
    public Tester(String id, String name, double salary, String role) {
        super(id, name, salary, role);
    }

    @Override
    double calculateSalary() {
        return Salary+(Salary*0.25);
    }
}
