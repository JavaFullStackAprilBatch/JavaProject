package com.bhuvama.workspace.employee;

import java.util.Date;

public class EmployeeDetails {
    public static void main(String[] args) {


        EmployeeManagementSystem ems=new EmployeeManagementSystem() ;
        ems.addEmployee(new Developer("John",101,56.0,40));
        ems.addEmployee(new Tester("Smith", 102, 35.0,40));
        ems.addEmployee(new Manager("Hobb",103, 64.0, 40));
        System.out.println("Calculating salaries:");
        ems.calculteSalaryandDisplay();
        Date processedDate=new Date();
        System.out.println("****************************");
        System.out.println("Processing payments:");
        ems.processPayment(ems.salary,processedDate);
        System.out.println("Refund payments:");
        ems.refundPayment(200,processedDate);
    }
}
