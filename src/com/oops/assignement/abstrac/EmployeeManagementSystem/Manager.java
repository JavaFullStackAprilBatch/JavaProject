package com.oops.assignement.abstrac.EmployeeManagementSystem;

public class Manager extends Employee {

    public Manager(String id,String name,double salary, String role){
        super(id,name,salary,role);

    }

    @Override
    double calculateSalary() {
        return Salary+(Salary*0.2);
    }
}
