package com.oops.assignement.inheritance.EmployeeManagementSystem;

import java.util.Scanner;

public class PrintSalary {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Employee emp = new Employee();
        Manager manager = new Manager();
        Developer developer = new Developer();
        Tester tester = new Tester();

        System.out.print("Enter Employee Id: ");
        manager.setId(scanner.nextInt());
        System.out.print("Enter Employee Name: ");
        manager.setName(scanner.next());
        System.out.print("Enter Employee Salary: ");
        manager.setSalary(scanner.nextDouble());
        manager.calculateSalary("Manager", manager.Salary );
        manager.displayDetails(manager.Name,manager.Salary);

        System.out.print("Enter Employee Id: ");
        developer.setId(scanner.nextInt());
        System.out.print("Enter Employee Name: ");
        developer.setName(scanner.next());
        System.out.print("Enter Employee Salary: ");
        developer.setSalary(scanner.nextDouble());
        developer.calculateSalary("Developer", developer.Salary );
        developer.displayDetails(developer.Name,developer.Salary);

        System.out.print("Enter Employee Id: ");
        emp.setId(scanner.nextInt());
        System.out.print("Enter Employee Name: ");
        emp.setName(scanner.next());
        System.out.print("Enter Employee Salary: ");
        emp.setSalary(scanner.nextDouble());
        tester.calculateSalary("Tester", emp.Salary);
        tester.displayDetails(emp.Name,emp.Salary);

    }
}