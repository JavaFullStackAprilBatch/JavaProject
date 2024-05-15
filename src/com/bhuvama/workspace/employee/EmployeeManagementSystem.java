package com.bhuvama.workspace.employee;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public   class EmployeeManagementSystem {

   List<Employee> emplist;
   double salary;
   public EmployeeManagementSystem() {
      emplist=new ArrayList<>();

   }

   public void addEmployee(Employee employee)
   {
      emplist.add(employee);
   }

   public double calculteSalaryandDisplay()
   {
      for(Employee employee:emplist)
      {
          salary=employee.CalculateSalary();
         System.out.println("Employee Name:" +employee.name +"  " +"Employee id:" +employee.id +" "+"Emp Salary:" +salary);

      }
     return salary;

   }




   public void processPayment(double amount, Date processedDate) {
     for(Employee employee:emplist)
     {
        employee.processPayment(employee.CalculateSalary(),processedDate);

     }

   }




   public void refundPayment(double amount, Date refundDate) {
      for(Employee employee:emplist)
      {
         employee.refundPayment(amount,refundDate);
      }

   }
}
