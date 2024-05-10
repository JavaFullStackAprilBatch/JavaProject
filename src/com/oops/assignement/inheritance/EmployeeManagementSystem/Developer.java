package com.oops.assignement.inheritance.EmployeeManagementSystem;

public class Developer extends Employee {
    public void displayDetails(String Name, double salary){
        System.out.println("Developer "+Name+" Salary: "+salary);
    }
}
