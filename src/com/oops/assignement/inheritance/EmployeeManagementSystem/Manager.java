package com.oops.assignement.inheritance.EmployeeManagementSystem;

public class Manager extends Employee {
    public void displayDetails(String Name, double salary){
        System.out.println("Manager "+Name+" Salary: "+salary);
    }
}
