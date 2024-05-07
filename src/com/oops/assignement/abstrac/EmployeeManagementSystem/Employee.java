package com.oops.assignement.abstrac.EmployeeManagementSystem;

public abstract class Employee {

    String Id;
    String Name;
    double Salary;
    String Role;

    public Employee (String id,String name,double salary, String role){
        this.Id = id;
        this.Name = name;
        this.Salary = salary;
        this.Role = role;
    }

    abstract double calculateSalary();

    public void displayDetails(){
        System.out.println(Role+" Details");
        System.out.println("ID: "+Id);
        System.out.println("Name: "+Name);
        System.out.println("Salary: "+Salary);
    }
}
