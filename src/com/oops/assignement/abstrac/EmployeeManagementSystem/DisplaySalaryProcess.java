package com.oops.assignement.abstrac.EmployeeManagementSystem;

public class DisplaySalaryProcess {

    public static void main(String [] arg){

        Manager manager = new Manager("1001","Raja",20000,"Manager");
        manager.displayDetails();
        System.out.println("Calculated Manager Salary: "+manager.calculateSalary());
        System.out.println("------------------------------------------------------");

        Developer developer = new Developer("2001","Sekhar",15000, "Developer");
        developer.displayDetails();
        System.out.println("Calculated Developer Salary: "+developer.calculateSalary());
        System.out.println("------------------------------------------------------");

        Tester tester = new Tester("2002","Kasani",12000,"Tester");
        tester.displayDetails();
        System.out.println("Calculated Tester Salary: "+tester.calculateSalary());
        System.out.println("------------------------------------------------------");
    }
}
