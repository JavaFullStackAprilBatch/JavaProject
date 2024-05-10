package com.oops.assignement.abstrac.EmployeeManagementSystem;

public class Developer extends Employee{


    public Developer(String id, String name, double salary, String role) {
        super(id, name, salary, role);
    }

    @Override
    double calculateSalary() {
        return Salary+(Salary*0.5);
    }
}
