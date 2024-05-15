package com.bhuvama.workspace.employee;

import java.text.SimpleDateFormat;
import java.util.Date;

public  class Employee implements PaymentMethod{
    String name;
    int id;
    Double hourlyRate;
    int hoursWorked;
    Date processDate;



    public Employee(String name,int id, double hourlyrate, int hoursworked)
    {
        this.name=name;
        this.id=id;
        this.hourlyRate=hourlyrate;
        this.hoursWorked=hoursworked;

    }

    public Double CalculateSalary()
    {
        return hourlyRate*hoursWorked;
    }
    public void displaydetails()
    {
        System.out.println("Employeename : " +id);
        System.out.println("Employeeid:  " +name);
    }
public String getName()
{
    return name;
}
    public void setName(String name)
    {
        this.name=name;
    }

    public int getid()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id=id;
    }

    public void date()
    {
        Date date=new Date();
        String pattern="YYYY-MM-dd HH:mm:ss";
        SimpleDateFormat dateFormat=new SimpleDateFormat(pattern);
        String formatedDate= dateFormat.format(date);
    }
    @Override
    public void processPayment(double amount, Date processDate) {
        this.processDate=processDate;
        System.out.println("Processd Payment for "+name +"  " + ", and ID is" +id +"  Amount" +" " +amount
                +",Process Date: " +processDate
        );


    }

    @Override
    public void refundPayment(double amount, Date refundDate) {

        System.out.println("Refund Processed for "+name +"  "+ "and ID is" +id +"   Amount"+" " + amount
                + ", Refund Date: " + refundDate);
    }
}
