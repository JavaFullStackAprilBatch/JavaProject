package com.oops.assignement.inheritance.EmployeeManagementSystem;

public class Employee {

    Integer Id;
    String Name;
    double Salary;

    public Integer getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public double getSalary() {
        return Salary;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public void calculateSalary(String role, double sal){
        if (role == "Manager") {
           setSalary(sal);
        } else if (role == "Developer") {
          setSalary(sal);
        }else {
          setSalary(sal);
        }
    }

    public void displayDetails(String role, double salary){
        System.out.println(role+" Salary : " +salary);
    }
}
